package me.liuhu.study.leetcode.q21;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/15
 **/
public class Solution2_2 implements Solution {

    @Override
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (null == l2) {
            return l1;
        }
        if (null == l1) {
            return l2;
        }

        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}
