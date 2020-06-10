package me.liuhu.study.leetcode.q1115;

import java.util.concurrent.Semaphore;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/10
 **/
public class FooBar2 implements FooBar {

    private Semaphore semaphoreFoo = new Semaphore(1);
    private Semaphore semaphoreBar = new Semaphore(0);

    private int n;

    public FooBar2(int n) {
        this.n = n;
    }

    @Override
    public void foo(Runnable printFoo) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            semaphoreFoo.acquire(1);
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            semaphoreBar.release(1);
        }
    }

    @Override
    public void bar(Runnable printBar) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            semaphoreBar.acquire(1);

            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            semaphoreFoo.release(1);
        }
    }
}
