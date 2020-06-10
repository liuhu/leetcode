package me.liuhu.study.leetcode.q1115;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/10
 **/
public class FooBar1 implements FooBar {

    private AtomicInteger count = new AtomicInteger(0);
    private int n;

    public FooBar1(int n) {
        this.n = n;
    }

    @Override
    public void foo(Runnable printFoo) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            while (true) {
                if (count.get() % 2 == 0) {
                    // printFoo.run() outputs "foo". Do not change or remove this line.
                    printFoo.run();
                    count.incrementAndGet();
                    break;
                }
            }
        }
    }

    @Override
    public void bar(Runnable printBar) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            while (true) {
                if (count.get() % 2 != 0) {
                    // printBar.run() outputs "bar". Do not change or remove this line.
                    printBar.run();
                    count.incrementAndGet();
                    break;
                }
            }
        }
    }
}
