package me.liuhu.study.algorithm.linkedlist;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @description:
 * @author: LiuHu
 * @create: 2019/10/28
 **/
public class LinkedListDemo {

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


    public static boolean isLoopbackTextByOriginalLinkedList(Node fistNode) {
        Node slow  = fistNode;
        Node fast = fistNode;
        // 慢指针一次跳1格，快指针一次跳2格。当快指针到终点是，慢指针在中间位置。
        // 但要注意奇偶链表但情况
        while (null != fast.next && null != fast.next.next) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 获取中间节点
        Node mid;
        boolean isContainMid;
        // 奇偶判定
        if (null == fast.next) { // 12(3)21
            mid = slow;
            isContainMid = false;
        } else { // 12(2)1
            mid = slow.next;
            isContainMid = true;
        }

        // 转置 1～mid
        Node newFirst = fistNode;
        while (null != fistNode && null != fistNode.next) {
            if (fistNode.next == mid) {
                break;
            }

            Node next = fistNode.next;
            Node next2 = fistNode.next.next;
            // 2 -> 1, 将第二个节点作为首节点，即 oldFirstNode.next.next 为 newFirst
            next.next = newFirst;
            // 1 -> 3
            fistNode.next = next2;
            // 新的首节点
            newFirst = next;
        }

        // 奇偶位矫正
        Node node = newFirst;
        Node compare = null;
        if (isContainMid) {
            compare = mid;
        } else {
            compare = mid.next;
        }
        // 比较
        while (null != compare) {
            if (!node.data.equals(compare.data)) {
                return false;
            }
            node = node.next;
            compare = compare.next;
        }

        return true;
    }

    /**
     * 链表转置
     * @param oldFirstNode
     * @return new firstNode
     */
    public static Node reverse(Node oldFirstNode) {
        // 新的首个节点
        Node newFirst = oldFirstNode;
        while (null != oldFirstNode && null != oldFirstNode.next) {
            Node next = oldFirstNode.next;
            Node next2 = oldFirstNode.next.next;
            // 2 -> 1, 将第二个节点作为首节点，即 oldFirstNode.next.next 为 newFirst
            next.next = newFirst;
            // 1 -> 3
            oldFirstNode.next = next2;
            // 新的首节点
            newFirst = next;
        }
        return newFirst;
    }

    /**
     * 打印
     * @param firstNode
     */
    public static void printNote(Node firstNode) {
        Node node = firstNode;
        while (null != node) {
            System.out.println(node.data);
            node = node.next;
        }
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
