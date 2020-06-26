package me.liuhu.study.algorithm.queue;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/26
 **/
public class QueueUseLinkedList {
    class Node {
        Object val;
        Node next;
        public Node(Object val, Node next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    private Node head;
    private Node tail;

    public QueueUseLinkedList() {
    }

    public void enqueue(Object o) {
        Node newNode = new Node(o, null);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
    }

    public Object dequeue() {
        if (head == null) {
            return null;
        }

        Object value = head.val;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return value;
    }

    public static void main(String[] args) {
        QueueUseLinkedList queue = new QueueUseLinkedList();
        queue.enqueue("1");
        queue.enqueue("2");
        queue.enqueue("3");

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        queue.enqueue("1");
        System.out.println(queue.dequeue());

    }
}
