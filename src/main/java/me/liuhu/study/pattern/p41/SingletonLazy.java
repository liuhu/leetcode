package me.liuhu.study.pattern.p41;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/2/22
 **/
public class SingletonLazy implements IdGenerator {
    private AtomicLong id = new AtomicLong(0);

    private static final SingletonLazy INSTANCE = new SingletonLazy();
    // 目的为了让外部无法实例化
    private SingletonLazy () {
    }

    public static SingletonLazy getInstance () {
        return INSTANCE;
    }

    @Override
    public long getId() {
        return id.getAndIncrement();
    }
}
