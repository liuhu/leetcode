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
public class StopThreadUseFlag {


    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue(10);

        Producer producer =  new StopThreadUseFlag().new Producer(queue);
        Thread producerThread = new Thread(producer);
        producerThread.start();
        Thread.sleep(1000);

        Consumer consumer = new StopThreadUseFlag().new Consumer(queue);
        while (consumer.needMoreNums()) {
            System.out.println(consumer.queue.take()+"被消费了");
            Thread.sleep(1000);
        }
        log.info("消费者不需要更多数据了.");

        //一旦消费不需要更多数据了，我们应该让生产者也停下来，但是实际情况
        producer.canceled = true;
        log.info("{}", producer.canceled);
    }


    class Producer implements Runnable {
        public volatile boolean canceled = false;

        private BlockingQueue<Integer> queue;
        public Producer(BlockingQueue<Integer> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            int num = 0;
            try {
                while (num <= 100000 && !canceled) {
                    if (num % 10 == 0) {
                        queue.put(num);
                        log.info("生产了: {}", num);
                    }
                    num ++;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                log.info("停止生产");
            }
        }
    }

    class Consumer {

        BlockingQueue<Integer> queue;

        public Consumer(BlockingQueue<Integer> queue) {
            this.queue = queue;
        }

        public boolean needMoreNums() {
            if (Math.random() > 0.9) {
                return false;
            }
            return true;
        }
    }
}
