package me.liuhu.study.leetcode.q1114;

import java.util.concurrent.CountDownLatch;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/10
 **/
public class Foo1 implements Foo {
    private final CountDownLatch countDownLatch01;
    private final CountDownLatch countDownLatch02;

    public Foo1() {
        countDownLatch01 = new CountDownLatch(1);
        countDownLatch02 = new CountDownLatch(1);
    }
    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        countDownLatch01.countDown();
    }
    public void second(Runnable printSecond) throws InterruptedException {
        countDownLatch01.await();
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        countDownLatch02.countDown();
    }
    public void third(Runnable printThird) throws InterruptedException {
        countDownLatch02.await();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
