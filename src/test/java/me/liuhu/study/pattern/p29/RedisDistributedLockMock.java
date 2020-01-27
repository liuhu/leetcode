package me.liuhu.study.pattern.p29;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/1/27
 **/
public class RedisDistributedLockMock implements IRedisDistributedLock {

    @Override
    public boolean lockTransaction(String id) {
        return false;
    }

    @Override
    public boolean unlockTransaction(String id) {
        return true;
    }
}
