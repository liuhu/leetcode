package me.liuhu.study.leetcode.q206;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/23
 **/
public class Solution2_1 implements Solution {
    @Override
    public ListNode reverseList(ListNode head) {
        if (null == head) {
            return null;
        }
        if (null == head.next) {
            return head;
        }

        ListNode c = reverseList(head.next);

        head.next.next = head;
        head.next = null;

        return c;
    }
}
