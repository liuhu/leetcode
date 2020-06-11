package me.liuhu.study.leetcode.q1114;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/11
 **/
public class Foo3 implements Foo {

    private final Lock lock = new ReentrantLock();
    private final Condition conditionSecond = lock.newCondition();
    private final Condition conditionThird = lock.newCondition();

    private volatile int step = 0;
    public Foo3() {

    }

    @Override
    public void first(Runnable printFirst) throws InterruptedException {
        lock.lock();
        try {
            printFirst.run();
            step = 2;
            conditionSecond.signal();
        } finally {
            lock.unlock();
        }
    }

    @Override
    public void second(Runnable printSecond) throws InterruptedException {
        lock.lock();

        try {
            while (step != 2) {
                conditionSecond.await();
            }
            printSecond.run();
            step = 3;
            conditionThird.signal();
        } finally {
            lock.unlock();
        }

    }

    @Override
    public void third(Runnable printThird) throws InterruptedException {
        lock.lock();
        try {
            while (step != 3) {
                conditionThird.await();
            }
            printThird.run();
        } finally {
            lock.unlock();
        }
    }
}
