package me.liuhu.study.leetcode.q1116;

import org.junit.Test;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/10
 **/
public class ZeroEvenOddTest {

    @Test
    public void zeroEvenOdd1() {
        ZeroEvenOdd zeroEvenOdd = new ZeroEvenOdd1(9);
        runTest(zeroEvenOdd);
    }


    private void runTest(ZeroEvenOdd zeroEvenOdd) {
        Thread a = new Thread(()->{
            try {
                zeroEvenOdd.zero(i -> System.out.print(i));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        a.setName("zero");

        Thread b = new Thread(()->{
            try {
                zeroEvenOdd.even(i -> System.out.print(i));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        b.setName("even");

        Thread c = new Thread(()->{
            try {
                zeroEvenOdd.odd(i -> System.out.print(i));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        c.setName("odd");

        a.start();
        c.start();
        b.start();
    }
}
