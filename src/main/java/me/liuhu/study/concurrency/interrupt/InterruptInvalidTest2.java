package me.liuhu.study.concurrency.interrupt;

import lombok.extern.slf4j.Slf4j;

/**
 * @description: loop 中对 InterruptedException 进行try/cache 后，对中断进行恢复
 * @author: LiuHu
 * @create: 2020/2/9
 **/
@Slf4j
public class InterruptInvalidTest2 implements Runnable {

    @Override
    public void run() {
        log.info("start run ....");
        for (int i = 0; i < 300; i++) {
            if (Thread.currentThread().isInterrupted()) {
                log.info("程序中断");
                return;
            }
            log.info("loop index: {}", i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                log.error("run error", e);
                // 中断程序
                Thread.currentThread().interrupt();
            }
        }
        log.info("stop run ....");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new InterruptInvalidTest2());
        t1.start();
        Thread.sleep(800);
        t1.interrupt();
    }
}
