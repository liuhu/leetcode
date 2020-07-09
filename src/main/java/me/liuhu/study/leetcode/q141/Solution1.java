package me.liuhu.study.leetcode.q141;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/9
 **/
public class Solution1 implements Solution {
    @Override
    public boolean hasCycle(ListNode head) {
        if (null == head || null == head.next) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
