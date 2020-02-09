package me.liuhu.study.concurrency.interrupt;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/2/9
 **/
public class NoBlockInterruptTest1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if (i % 10000 == 0) {
                System.out.println("10000的整数: " + i);
            }
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new NoBlockInterruptTest1());
        thread.start();
        // interrupt 仅仅是一个中断信号
        // 具体的如何操作需要被中断的线程自己处理
        // 当前的例子，子线程没有任何处理，所以会一直运行到计算完毕
        thread.interrupt();
    }
}
