package me.liuhu.study.pattern.p41;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/2/22
 **/
public class SingletonInnerClazz implements IdGenerator {
    private AtomicLong id = new AtomicLong(0);

    private SingletonInnerClazz() {}

    /**
     * 只有当调用 getInstance() 方法时，InnerClazz 才会被加载，这个时候才会创建 instance。
     * insance 的唯一性、创建过程的线程安全性，都由 JVM 来保证
     * @return
     */
    public static SingletonInnerClazz getInstance() {
        return InnerClazz.INSTANCE;
    }

    private static class InnerClazz {
        private static final SingletonInnerClazz INSTANCE = new SingletonInnerClazz();
    }

    @Override
    public long getId() {
        return id.getAndIncrement();
    }
}
