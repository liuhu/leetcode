package me.liuhu.study.leetcode.q141;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/9
 **/
public class Solution1_2 implements Solution {

    @Override
    public boolean hasCycle(ListNode head) {
        if (null == head) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;

        while (null != slow && null != fast) {
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
