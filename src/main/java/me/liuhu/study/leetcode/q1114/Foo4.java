package me.liuhu.study.leetcode.q1114;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/11
 **/
public class Foo4 implements Foo {

    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();

    private volatile int step = 0;
    public Foo4() {

    }

    @Override
    public void first(Runnable printFirst) throws InterruptedException {
        lock.lock();
        try {
            printFirst.run();
            step = 2;
            condition.signal();
        } finally {
            lock.unlock();
        }
    }

    @Override
    public void second(Runnable printSecond) throws InterruptedException {
        lock.lock();

        try {
            while (step != 2) {
                condition.await();
            }
            printSecond.run();
            step = 3;
            condition.signal();
        } finally {
            lock.unlock();
        }

    }

    @Override
    public void third(Runnable printThird) throws InterruptedException {
        lock.lock();
        try {
            while (step != 3) {
                condition.await();
            }
            printThird.run();
        } finally {
            lock.unlock();
        }
    }
}
