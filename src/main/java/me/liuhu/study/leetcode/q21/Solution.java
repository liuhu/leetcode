package me.liuhu.study.leetcode.q21;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/28
 **/
public interface Solution {
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    /**
     * 将两个升序链表合并为一个新的 升序 链表并返回
     * @param l1
     * @param l2
     * @return
     */
    ListNode mergeTwoLists(ListNode l1, ListNode l2);
}
