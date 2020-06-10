package me.liuhu.study.leetcode.q1114;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/10
 **/
public interface Foo {
    void first(Runnable printFirst) throws InterruptedException;
    void second(Runnable printSecond) throws InterruptedException;
    void third(Runnable printThird) throws InterruptedException;
}
