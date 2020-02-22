package me.liuhu.study.pattern.p41;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/2/22
 **/
public class SingletonHungry implements IdGenerator{
    private AtomicLong id = new AtomicLong(0);
    private static SingletonHungry INSTANCE = null;
    // 目的为了让外部无法实例化
    private SingletonHungry () {
    }

    /**
     * 这里不是线程安全的，会产生并发问题
     * @return
     */
    public static synchronized SingletonHungry getInstance() {
        if (null == INSTANCE) {
            INSTANCE = new SingletonHungry();
        }
        return INSTANCE;
    }

    @Override
    public long getId() {
        return id.getAndIncrement();
    }
}
