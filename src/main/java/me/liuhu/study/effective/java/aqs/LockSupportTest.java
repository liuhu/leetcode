package me.liuhu.study.effective.java.aqs;

import java.util.concurrent.locks.LockSupport;

/**
 * @description:
 * @author: LiuHu
 * @create: 2019-09-06 18:07
 **/
public class LockSupportTest {

    public static void main(String[] args) throws InterruptedException {
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("周末了我在打游戏");
                LockSupport.park();
                System.out.println("陪女朋友逛逛街");
            }
        });
        threadA.start();
        Thread.sleep(6000);
        System.out.println("女朋友准备要喊男朋友逛街");
        LockSupport.unpark(threadA);
    }
}
