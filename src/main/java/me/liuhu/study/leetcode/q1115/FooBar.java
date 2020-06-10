package me.liuhu.study.leetcode.q1115;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/10
 **/
public interface FooBar {

    void foo(Runnable printFoo) throws InterruptedException;

    void bar(Runnable printBar) throws InterruptedException;
}
