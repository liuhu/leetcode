package me.liuhu.study.concurrency.interrupt;

import lombok.extern.slf4j.Slf4j;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/2/9
 **/
@Slf4j
public class BlockInterruptWithLoopTest implements Runnable {
    @Override
    public void run() {
        try {
            log.info("start run ....");
            // 不需要 Thread.currentThread().isInterrupted() 检查
            // 因为 loop 中调用了 sleep
            for (int i = 0; i < 10000; i++) {
                // sleep 是阻塞方法，自己会检查线程中断状态
                // 如果检查到中断，会停止运行
                log.info("loop index: {}", i);
                Thread.sleep(10);
            }
            log.info("stop run ....");
        } catch (InterruptedException e) {
            log.error("Run error", e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new BlockInterruptWithLoopTest());
        t1.start();
        Thread.sleep(1000);
        t1.interrupt();
    }
}
