package me.liuhu.study.leetcode.q98;

import org.junit.Test;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/17
 **/
public class SolutionTest {

    @Test
    public void run1() {
        System.out.println("run test ... ");

        Solution solution = new Solution1_2();
        runTest(solution);
    }


    private void runTest(Solution solution) {
        Solution.TreeNode _1 = new Solution.TreeNode(1);
        Solution.TreeNode _3 = new Solution.TreeNode(3);

        Solution.TreeNode _2 = new Solution.TreeNode(2, _1, _3);
        solution.isValidBST(_2);
    }
}
