package me.liuhu.study.leetcode.q206;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/23
 **/
public interface Solution {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    ListNode reverseList(ListNode head);
}
