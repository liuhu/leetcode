package me.liuhu.study.pattern.p41;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/2/22
 **/
public enum SingletonEnum implements IdGenerator {
    INSTANCE;
    private AtomicLong id = new AtomicLong(0);

    @Override
    public long getId() {
        return id.getAndIncrement();
    }
}
