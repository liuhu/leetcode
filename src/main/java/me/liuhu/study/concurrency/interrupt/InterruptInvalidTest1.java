package me.liuhu.study.concurrency.interrupt;

import lombok.extern.slf4j.Slf4j;

/**
 * @description: loop 中对 InterruptedException 进行try/cache 导致程序无法结束
 * @author: LiuHu
 * @create: 2020/2/9
 **/
@Slf4j
public class InterruptInvalidTest1 implements Runnable {

    @Override
    public void run() {
        log.info("start run ....");
        for (int i = 0; i < 300; i++) {
            // 这个判定是需要的，如果线程被中断，则不再执行
            if (Thread.currentThread().isInterrupted()) {
                return;
            }

            log.info("loop index: {}", i);

            // InterruptedException 在 loop 中会导致中断失效
            // 因为 sleep InterruptedException 之后，会将中断标志清楚
            // 程序将一直运行，直到循环结束
            // 不符合预期
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                log.error("run error", e);
            }
        }
        log.info("stop run ....");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new InterruptInvalidTest1());
        t1.start();
        Thread.sleep(800);
        t1.interrupt();
    }
}
