package me.liuhu.study.leetcode.q4;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/11
 **/
public class Solution1 implements Solution {


    @Override
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return numToListNode(noteNum(l1) + noteNum(l2));
    }

    private int noteNum(ListNode node) {
        ListNode currentNote = node;
        int multiplyNum = 1;
        int sum = 0;
        while (null != currentNote) {
            sum = sum + currentNote.val * multiplyNum;
            multiplyNum = multiplyNum * 10;
            currentNote = currentNote.next;
        }
        return sum;
    }

    /**
     * 链表正序生成
     * @param sum
     * @return
     */
    private ListNode numToListNode(int sum) {
        if (0 == sum) {
            return new ListNode(0);
        }
        ListNode start = null;
        int c = sum;
        // 下个节点
        ListNode next = null;
        while (c != 0) {
            // 获取数字最后一位
            int digit = c % 10;
            c = c / 10;
            if (null == start) {
                start = new ListNode(digit);
                next = start;
            } else {
                ListNode current = new ListNode(digit);
                next.next = current;
                next = current;
            }
        }
        return start;
    }

    /**
     * 链表倒序生成
     * @param sum
     * @return
     */
    private ListNode numToListNode2(int sum) {
        ListNode node = null;
        int c = sum;
        while (c != 0) {
            // 获取数字最后一位
            int digit = c % 10;
            c = c / 10;
            if (null == node) {
                node = new ListNode(digit);
            } else {
                ListNode current = new ListNode(digit);
                current.next = node;
                node = current;
            }
        }
        return node;
    }
}
