package me.liuhu.study.leetcode.q1116;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntConsumer;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/10
 **/
public class ZeroEvenOdd1 implements ZeroEvenOdd {
    private Semaphore semaphoreZero = new Semaphore(1);
    private Semaphore semaphoreEven = new Semaphore(0);
    private Semaphore semaphoreOdd = new Semaphore(0);

    // 计数器
    private AtomicInteger count = new AtomicInteger();

    private int n;

    public ZeroEvenOdd1(int n) {
        this.n = n;
    }

    @Override
    public void zero(IntConsumer printNumber) throws InterruptedException {

        while (count.get() <= n) {
            // 退出条件
            if (count.get() == n) {
                return;
            }

            // 请求资源
            semaphoreZero.acquire(1);
            // 执行操作
            printNumber.accept(0);

            // 计数器 +1
            int currentCount = count.incrementAndGet();

            // 当前是偶数, 释放偶数资源
            if (currentCount % 2 == 0) {
                semaphoreEven.release(1);
            }

            // 当前是奇数, 释放奇数资源
            if (currentCount % 2 != 0) {
                semaphoreOdd.release(1);
            }

        }
    }

    @Override
    public void even(IntConsumer printNumber) throws InterruptedException {
        while (count.get() < n) {
            // 退出条件
            if (count.get() + 1 == n) {
                return;
            }
            semaphoreEven.acquire(1);
            printNumber.accept(count.intValue());
            semaphoreZero.release(1);
        }
    }

    @Override
    public void odd(IntConsumer printNumber) throws InterruptedException {
        while (count.get() < n) {
            // 退出条件
            if (count.get() + 1 == n) {
                return;
            }
            semaphoreOdd.acquire(1);
            printNumber.accept(count.intValue());
            semaphoreZero.release(1);
        }
    }
}
