package me.liuhu.study.pattern.p29;

import org.junit.Test;
import org.junit.Assert;

import javax.transaction.InvalidTransactionException;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/1/27
 **/
public class TransactionTest {

    @Test
    public void test_transaction_ok() throws InvalidTransactionException {

        String preAssignedId = "assignedId-111";
        Long buyerId = 123L;
        Long sellerId =  456L;
        Long productId = 789L;
        String orderId = "orderId-111";

        Transaction transaction = new Transaction(preAssignedId, buyerId, sellerId, productId, orderId);
        IRedisDistributedLock mockLock = new RedisDistributedLockMock() {
            @Override
            public boolean lockTransaction(String id) {
                return true;
            }

            @Override
            public boolean unlockTransaction(String id) {
                return true;
            }
        };
        transaction.setRedisDistributedLock(mockLock);
        transaction.setWalletRpcService(new WalletRpcServiceMock());
        transaction.setAmount(122.2);
        boolean status = transaction.execute();

        Assert.assertTrue(status);
        Assert.assertEquals(transaction.getStatus(), STATUS.EXECUTED);
    }


    @Test
    public void test_transaction_is_lock() throws InvalidTransactionException {

        String preAssignedId = "assignedId-111";
        Long buyerId = 123L;
        Long sellerId =  456L;
        Long productId = 789L;
        String orderId = "orderId-111";

        Transaction transaction = new Transaction(preAssignedId, buyerId, sellerId, productId, orderId);
        transaction.setAmount(122.2);

        transaction.setWalletRpcService(new WalletRpcServiceMock());
        transaction.setRedisDistributedLock(new RedisDistributedLockMock());
        boolean status = transaction.execute();

        Assert.assertFalse(status);
    }

    @Test
    public void test_transaction_is_expired() throws InvalidTransactionException  {
        String preAssignedId = "assignedId-111";
        Long buyerId = 123L;
        Long sellerId =  456L;
        Long productId = 789L;
        String orderId = "orderId-111";

        // 解决未决行为逻辑
        Transaction transaction = new Transaction(preAssignedId, buyerId, sellerId, productId, orderId) {
            @Override
            protected boolean isTransactionExpired(long executionInvokedTimestamp) {
                return true;
            }
        };

        IRedisDistributedLock mockLock = new RedisDistributedLockMock() {
            @Override
            public boolean lockTransaction(String id) {
                return true;
            }

            @Override
            public boolean unlockTransaction(String id) {
                return true;
            }
        };

        transaction.setRedisDistributedLock(mockLock);
        transaction.setWalletRpcService(new WalletRpcServiceMock());
        transaction.setAmount(122.2);

        boolean status = transaction.execute();

        Assert.assertFalse(status);
        Assert.assertEquals(transaction.getStatus(), STATUS.EXPIRED);

    }

}
