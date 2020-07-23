package me.liuhu.study.leetcode.q206;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/23
 **/
public class Solution2 implements Solution {
    @Override
    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null)  {
            return head;
        }
        ListNode p = reverseList(head.next);

        head.next.next = head;
        head.next = null;
        return p;
    }
}
