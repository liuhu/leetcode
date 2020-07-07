package me.liuhu.study.leetcode.q21;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/7
 **/
public class Solution1_2 implements Solution {

    @Override
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode node = new ListNode();
        ListNode current = node;
        while (null != l1 || null != l2) {
            if (null != l1 && null != l2) {
                if (l1.val < l2.val) {
                    current.next = l1;
                    l1 = l1.next;
                } else {
                    current.next = l2;
                    l2 = l2.next;
                }
                current = current.next;
            }

            if (null != l1 && null == l2) {
                current.next = l1;
                l1 = l1.next;
                current = current.next;
            }

            if (null != l2 && null == l1) {
                current.next = l2;
                l2 = l2.next;
                current = current.next;
            }
        }

        return node.next;
    }
}
