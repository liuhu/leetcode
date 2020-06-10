package me.liuhu.study.leetcode.q1115;

import org.junit.Test;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/10
 **/
public class FooBarTest {

    @Test
    public void runFooBar1() {
        FooBar fooBar = new FooBar1(5);
        runTest(fooBar);
    }


    @Test
    public void runFooBar2() {
        FooBar fooBar = new FooBar2(3);
        runTest(fooBar);
    }


    private void runTest(FooBar fooBar) {
        Thread a = new Thread(()->{
            try {
                fooBar.foo(()->{
                    System.out.println("foo");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread b = new Thread(()->{
            try {
                fooBar.bar(()->{
                    System.out.println("bar");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        b.start();
        a.start();
    }
}
