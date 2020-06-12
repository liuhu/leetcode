package me.liuhu.study.leetcode.q4;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/11
 **/
public class Solution2 implements Solution {


    @Override
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode start = new ListNode(0);
        // 下个节点
        ListNode next = null;

        ListNode cl1 = l1;
        ListNode cl2 = l2;
        boolean isCarryBit = false;
        int l1Num = 0;
        int l2Num = 0;
        while (null != cl1 || null != cl2 || isCarryBit) {
            if (null != cl1) {
                l1Num = cl1.val;
                cl1 = cl1.next;
            } else {
                l1Num = 0;
            }
            if (null != cl2) {
                l2Num = cl2.val;
                cl2 = cl2.next;
            } else {
                l2Num = 0;
            }
            // 处理进位
            int sum = 0;
            if (isCarryBit) {
                sum = l1Num + l2Num + 1;
            } else {
                sum = l1Num + l2Num;
            }

            if (sum >= 10) {
                isCarryBit =  true;
            } else {
                isCarryBit = false;
            }

            int val = isCarryBit ? sum % 10 : sum;
            // 第一次
            if (null == next) {
                start.val = val;
                next = start;
            } else {
                ListNode current = new ListNode(val);
                next.next = current;
                next = current;
            }
        }
        return start;
    }
}
