package me.liuhu.study.pattern.p29;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/1/27
 **/
public interface IWalletRpcService {
    String moveMoney(String id, Long buyerId, Long sellerId, Double amount);
}
