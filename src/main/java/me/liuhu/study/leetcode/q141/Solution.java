package me.liuhu.study.leetcode.q141;

/**
 * 141. 环形链表
 * https://leetcode-cn.com/problems/linked-list-cycle/
 *
 * @description:
 * @author: LiuHu
 * @create: 2020/7/9
 **/
public interface Solution {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    boolean hasCycle(ListNode head);
}
