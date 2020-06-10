package me.liuhu.study.leetcode.q1116;

import java.util.function.IntConsumer;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/10
 **/
public interface ZeroEvenOdd {

    void zero(IntConsumer printNumber) throws InterruptedException;

    void even(IntConsumer printNumber) throws InterruptedException;

    void odd(IntConsumer printNumber) throws InterruptedException;
}
