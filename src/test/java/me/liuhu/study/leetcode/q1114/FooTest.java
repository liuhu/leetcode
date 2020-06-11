package me.liuhu.study.leetcode.q1114;

import lombok.SneakyThrows;
import org.junit.Test;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/10
 **/
public class FooTest {

    @Test
    public void runFoo1() {
        System.out.println("run test ... ");
        Foo foo1 = new Foo1();
        runTest(foo1);
    }

    @Test
    public void runFoo2() {
        System.out.println("run test ... ");
        Foo foo2 = new Foo2();
        runTest(foo2);
    }

    @Test
    public void runFoo3() {
        System.out.println("run test ... ");
        Foo foo = new Foo3();
        runTest(foo);
    }

    @Test
    public void runFoo4() {
        System.out.println("run test ... ");
        Foo foo = new Foo4();
        runTest(foo);
    }

    @SneakyThrows
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
        Thread.sleep(200);
        a.start();
        Thread.sleep(300);
        b.start();
    }
}
