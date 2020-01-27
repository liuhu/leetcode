package me.liuhu.study.pattern.p29;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/1/27
 **/
public class RedisDistributedLock implements IRedisDistributedLock{

    public boolean lockTransaction(String id) {
        return true;
    }
    public boolean unlockTransaction(String id) {
        return true;
    }

}
