package me.liuhu.study.pattern.p29;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/1/27
 **/
public interface IRedisDistributedLock {
    boolean lockTransaction(String id);
    boolean unlockTransaction(String id);
}
