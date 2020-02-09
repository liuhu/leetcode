package me.liuhu.study.concurrency.interrupt;

import lombok.extern.slf4j.Slf4j;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/2/9
 **/
@Slf4j
public class BlockInterruptTest implements Runnable {
    @Override
    public void run() {
        try {
            log.info("start run ....");
            for (int i = 0; i <= 50000; i++) {
                // 这个判定是需要的，如果线程被中断，则不再执行
                if (Thread.currentThread().isInterrupted()) {
                    return;
                }
                if (i % 10000 == 0) {
                    System.out.println("10000的整数: " + i);
                }
            }
            // sleep 是阻塞方法，自己会检查线程中断状态
            // 如果检查到中断，会停止运行
            Thread.sleep(1000);
            log.info("stop run ....");
        } catch (InterruptedException e) {
            log.error("Run error", e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new BlockInterruptTest());
        t1.start();
        Thread.sleep(800);
        t1.interrupt();
    }
}
