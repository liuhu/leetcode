package me.liuhu.study.leetcode.q206;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/23
 **/
public class Solution1_1 implements Solution {

    @Override
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode current = head;
        while (null != current) {
            ListNode next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        return pre;
    }
}
