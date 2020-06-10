package me.liuhu.study.leetcode.q1114;


/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/10
 **/
public class Foo2 implements Foo {
    private final Object lock = new Object();
    private volatile int step = 1;
    public Foo2() {

    }
    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        synchronized (lock) {
            while (step != 1) {
                lock.wait();
            }
            printFirst.run();
            step = 2;
            lock.notifyAll();
        }
    }
    public void second(Runnable printSecond) throws InterruptedException {
        // printSecond.run() outputs "second". Do not change or remove this line.
        synchronized (lock) {
            while (step != 2) {
                lock.wait();
            }
            printSecond.run();
            step = 3;
            lock.notifyAll();
        }
    }
    public void third(Runnable printThird) throws InterruptedException {
        // printThird.run() outputs "third". Do not change or remove this line.
        synchronized (lock) {
            while (step != 3) {
                lock.wait();
            }
            printThird.run();
            lock.notifyAll();
        }
    }
}
