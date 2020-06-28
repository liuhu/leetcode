package me.liuhu.study.leetcode.q21;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/28
 **/
public class Solution1 implements Solution {

    /**
     * Time: O(n)
     * Space: O(1)
     * @param l1
     * @param l2
     * @return
     */
    @Override
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // 哨兵节点
        ListNode header = new ListNode(-1);
        // 当前节点
        ListNode current = header;
        while (null != l1 && null != l2) {
            if (l1.val > l2.val) {
                current.next = l2;
                l2 = l2.next;
            } else {
                current.next = l1;
                l1 = l1.next;
            }
            current = current.next;
        }
        if (l1 == null) {
            current.next = l2;
        } else {
            current.next = l1;
        }

        return header.next;
    }
}
