package me.liuhu.study.leetcode.q141;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/8/12
 **/
public class Solution1_3 implements Solution {
    @Override
    public boolean hasCycle(ListNode head) {
        if (null == head || null == head.next) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != null && fast != null) {
            if (slow == fast) {
                return true;
            }
            slow = slow.next;
            if (null == fast.next) {
                return false;
            }
            fast = fast.next.next;
        }
        return false;
    }
}
