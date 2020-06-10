package me.liuhu.study.leetcode.q1114;

import org.junit.Test;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/10
 **/
public class FooTest {

    @Test
    public void runFoo1() {
        Foo foo1 = new Foo1();
        runTest(foo1);
    }

    @Test
    public void runFoo2() {
        Foo foo2 = new Foo2();
        runTest(foo2);
    }

    private void runTest(Foo foo) {
        Thread a = new Thread(()->{
            try {
                foo.first(()->{
                    System.out.println("one");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread b = new Thread(()->{
            try {
                foo.second(()->{
                    System.out.println("two");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread c = new Thread(()->{
            try {
                foo.third(()->{
                    System.out.println("three");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        c.start();
        a.start();
        b.start();
    }
}
