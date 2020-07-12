package me.liuhu.study.leetcode.q21;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/12
 **/
public class Solution2 implements Solution {
    @Override
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(-1);
        mergeTwoLists(node, l1, l2);
        return node.next;
    }


    public void mergeTwoLists(ListNode next, ListNode l1, ListNode l2) {
        if (null == l1) {
            next.next = l2;
            return;
        }

        if (null == l2) {
            next.next = l1;
            return;
        }

        if (l1.val < l2.val) {
            next.next = l1;
            next = next.next;
            mergeTwoLists(next, l1.next, l2);
        } else {
            next.next = l2;
            next = next.next;
            mergeTwoLists(next, l1, l2.next);
        }
    }
}
