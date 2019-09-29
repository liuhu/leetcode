package me.liuhu.study.effective.java.aqs;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @description:
 * @author: LiuHu
 * @create: 2019-09-06 17:26
 **/
@Slf4j
public class CountDownLatchTest {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService e = Executors.newFixedThreadPool(5);
        CountDownLatch downLatch = new CountDownLatch(5);
        for (int i = 0; i < 5; i++) {
            e.submit(() -> {
                try {
                    Thread.sleep(10000 + new Random().nextInt(1000));
                    log.info("执行完成");
                } catch (InterruptedException ex) {
                    log.error("执行失败", ex);
                } finally {
                    downLatch.countDown();
                }
            });
        }

        downLatch.await();
        log.info("处理完成");
        e.shutdown();
    }
}
