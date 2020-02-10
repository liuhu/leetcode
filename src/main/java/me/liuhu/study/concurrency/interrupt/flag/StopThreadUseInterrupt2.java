package me.liuhu.study.concurrency.interrupt.flag;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/2/10
 **/
@Slf4j
public class StopThreadUseInterrupt2 {


    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue(10);

        Producer producer =  new StopThreadUseInterrupt2().new Producer(queue);
        Thread producerThread = new Thread(producer);
        producerThread.start();
        Thread.sleep(1000);

        Consumer consumer = new StopThreadUseInterrupt2().new Consumer(queue);
        while (consumer.needMoreNums()) {
            System.out.println(consumer.queue.take()+"被消费了");
            Thread.sleep(100);
        }
        log.info("消费者不需要更多数据了.");

        //一旦消费不需要更多数据了，我们应该让生产者也停下来，但是实际情况
        producerThread.interrupt();
    }


    class Producer implements Runnable {
        public volatile boolean canceled = false;

        private BlockingQueue<Integer> queue;
        public Producer(BlockingQueue<Integer> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            boolean isInterrupt = false;
            int num = 0;
            try {
                while (true) {
                    if (num % 10 == 0) {
                        queue.put(num);
                        log.info("生产了: {}", num);
                    }
                    num ++;
                }
            } catch (InterruptedException e) {
                isInterrupt = true;
                e.printStackTrace();
            } finally {
                log.info("停止生产");
                if (isInterrupt) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    class Consumer {

        BlockingQueue<Integer> queue;

        public Consumer(BlockingQueue<Integer> queue) {
            this.queue = queue;
        }

        public boolean needMoreNums() {
            if (Math.random() > 0.95) {
                return false;
            }
            return true;
        }
    }
}
