package me.liuhu.study.algorithm.array;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @description:
 * @author: LiuHu
 * @create: 2019/10/28
 **/
public class ArrayDemo {

    /**
     * 是否是回文文本
     * @param text
     * @return
     */
    public static boolean isLoopbackText(String text) {
        Objects.requireNonNull(text, "Text must not null");
        char[] chars = text.toCharArray();
        int length = chars.length;
        int loopTimes = length / 2;
        for (int i = 0; i < loopTimes; i++) {
            if (chars[i] != chars[length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * 使用linked list 校验回文
     * @param text
     * @return
     */
    public static boolean isLoopbackTextByLinkedList(String text) {
        Objects.requireNonNull(text, "Text must not null");

        // 将字符串转为 linked list 存储
        char[] chars = text.toCharArray();
        List<String> stringList = IntStream.range(0, text.length())
                .mapToObj(i -> String.valueOf(chars[i])).collect(Collectors.toList());
        LinkedList<String> linkedList = new LinkedList<>(stringList);
        while (null != linkedList.peekFirst() && linkedList.size() > 1) {
            if (!linkedList.pollFirst().equals(linkedList.pollLast())) {
                return false;
            }
        }
        return true;
    }


    public static class MyLinkedList<E> {
        private Node<E> firstNode;
        private Node<E> lastNode;
        private int size;

        public E getFirst() {
            return null != firstNode ? firstNode.getData() : null;
        }

        public Node<E> getFirstNode() {
            return firstNode;
        }

        public int size() {
            return size;
        }

        public void add(E data) {
            if (null == firstNode) {
                Node<E> node = new Node(data, null);
                firstNode = node;
                lastNode = node;
            } else {
                Node<E> node = new Node(data, null);
                lastNode.next = node;
                lastNode = node;
            }
            size = size + 1;
        }
    }

    /**
     * 链表节点
     */
    public static class Node<E> {
        private E data;
        private Node next;

        public Node(E data, Node next) {
            this.data = data;
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }
    }
}
