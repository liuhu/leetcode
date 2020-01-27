package me.liuhu.study.pattern.p29;

import lombok.Data;

import javax.transaction.InvalidTransactionException;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/1/26
 **/
@Data
public class Transaction {
    private String id;
    private Long buyerId;
    private Long sellerId;
    private Long productId;
    private String orderId;
    private Long createTimestamp;
    private Double amount;
    private STATUS status;
    private String walletTransactionId;

    // 通过注入的方式加入外部依赖, 方便 Mock
    private IRedisDistributedLock redisDistributedLock;
    private IWalletRpcService walletRpcService;

    private Transaction() {

    }

    public Transaction(String preAssignedId, Long buyerId, Long sellerId, Long productId, String orderId) {
        generateTransactionId(preAssignedId);
        this.buyerId = buyerId;
        this.sellerId = sellerId;
        this.productId = productId;
        this.orderId = orderId;
        this.status = STATUS.TO_BE_EXECUTD;
        this.createTimestamp = System.currentTimeMillis();
    }

    private void generateTransactionId(String preAssignedId) {
        if (preAssignedId != null && !preAssignedId.isEmpty()) {
            this.id = preAssignedId;
        } else {
            this.id = IdGenerator.generateTransactionId();
        }
        if (!this.id.startsWith("t_")) {
            this.id = "t_" + preAssignedId;
        }
    }

    /**
     * 执行转账
     * 1、校验转账信息
     * 2、幂等校验，已经转账成功的直接返回成功
     * 3、获取锁
     * 4、订单超多14天就过期
     * 5、执行转账RPC接口
     * 6、根据接口返回 判断转账是否成功
     * 7、释放锁
     * @return
     * @throws InvalidTransactionException
     */
    public boolean execute() throws InvalidTransactionException {
        if ((buyerId == null || (sellerId == null || amount < 0.0))) {
            throw new InvalidTransactionException("...");
        }
        if (status == STATUS.EXECUTED) return true;
        boolean isLocked = false;
        try {
            isLocked = redisDistributedLock.lockTransaction(id);
            if (!isLocked) {
                return false; // 锁定未成功，返回false，job兜底执行
            }
            if (status == STATUS.EXECUTED) { // double check
                return true;
            }
            long executionInvokedTimestamp = System.currentTimeMillis();

            if (isTransactionExpired(executionInvokedTimestamp)) {
                this.status = STATUS.EXPIRED;
                return false;
            }

            String walletTransactionId = walletRpcService.moveMoney(id, buyerId, sellerId, amount);
            if (walletTransactionId != null) {
                this.walletTransactionId = walletTransactionId;
                this.status = STATUS.EXECUTED;
                return true;
            } else {
                this.status = STATUS.FAILED;
                return false;
            }
        } finally {
            if (isLocked) {
                redisDistributedLock.unlockTransaction(id);
            }
        }
    }

    protected boolean isTransactionExpired(long executionInvokedTimestamp) {
        if (executionInvokedTimestamp - createTimestamp > 14 * 24 * 60 * 60 * 1000) {
            return true;
        }
        return false;
    }
}
