package me.liuhu.study.leetcode.q4;


import org.junit.Test;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/11
 **/
public class SolutionTest {

    /**
     * 执行未通过，超出内存
     */
    @Test
    public void runFoo2() {
        System.out.println("run test ... ");
        Solution solution = new Solution1();

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);


        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode node = solution.addTwoNumbers(l1, l2);
        System.out.println(node);
    }
}
