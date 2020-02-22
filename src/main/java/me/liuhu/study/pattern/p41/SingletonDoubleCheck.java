package me.liuhu.study.pattern.p41;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/2/22
 **/
public class SingletonDoubleCheck implements IdGenerator {
    private AtomicLong id = new AtomicLong(0);
    private static volatile SingletonDoubleCheck INSTANCE = null;
    // 目的为了让外部无法实例化
    private SingletonDoubleCheck () {
    }

    public static SingletonDoubleCheck getInstance() {
        if (null == INSTANCE) {
            synchronized (SingletonDoubleCheck.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonDoubleCheck();
                }
            }
        }
        return INSTANCE;
    }

    @Override
    public long getId() {
        return id.getAndIncrement();
    }
}
