package me.liuhu.study.pattern.p29;

import java.util.UUID;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/1/27
 **/
public class WalletRpcServiceMock implements IWalletRpcService {
    @Override
    public String moveMoney(String id, Long buyerId, Long sellerId, Double amount) {
        return UUID.randomUUID().toString();
    }
}
