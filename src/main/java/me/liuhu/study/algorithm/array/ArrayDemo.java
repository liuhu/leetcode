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


    /**
     * 链表节点
     */
    public class Node<E> {
        private E data;
        private Node next;

        public Object getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
