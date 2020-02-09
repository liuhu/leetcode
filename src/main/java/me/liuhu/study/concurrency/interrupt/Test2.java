package me.liuhu.study.concurrency.interrupt;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/2/9
 **/
public class Test2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            // 如果线程被中断，则不再执行
            if (Thread.currentThread().isInterrupted()) {
                return;
            }
            if (i % 10000 == 0) {
                System.out.println("10000的整数: " + i);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Test2());
        thread.start();
        Thread.sleep(100);
        thread.interrupt();
    }
}
