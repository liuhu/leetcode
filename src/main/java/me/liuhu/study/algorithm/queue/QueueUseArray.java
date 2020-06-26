package me.liuhu.study.algorithm.queue;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/26
 **/
public class QueueUseArray {
    private Object[] objects;
    private int head = 0;
    private int tail = 0;

    public QueueUseArray(int size) {
        objects = new Object[size];
    }

    public boolean enqueue(Object o) {
        // 队列已满
        if (tail == objects.length && head == 0) {
            return false;
        }

        // 数据搬移
        if (tail == objects.length) {
            for (int i = head; i < tail; ++i) {
                objects[i - head] = objects[i];
            }
//            for (int i = 0; i < tail - head; i++) {
//                objects[i] = objects[head + i];
//            }
            tail = tail - head;
            head = 0;
        }

        objects[tail] = o;
        tail ++;

        return true;
    }

    public Object dequeue() {
        if (head == tail) {
            return null;
        }
        Object o = objects[head];
        head ++;
        return o;
    }

    public static void main(String[] args) {
        QueueUseArray queue = new QueueUseArray(3);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

    }
}
