package me.liuhu.study.algorithm.queue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/28
 **/
public class DequeUsage {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();

        deque.addFirst("a");
        deque.addFirst("b");
        deque.addFirst("c");
        System.out.println(deque);

        String str = deque.peek();
        System.out.println(str);
        System.out.println(deque);

        while (deque.size() > 0) {
            System.out.println(deque.removeFirst());
        }
        System.out.println(deque);
    }
}
