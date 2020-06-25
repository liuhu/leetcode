package me.liuhu.study.leetcode.q283;

import org.junit.Assert;
import org.junit.Test;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/12
 **/
public class SolutionTest {


    @Test
    public void run_solution1_swap_test() {
        Solution1 solution = new Solution1();
        int[] nums = {0 , 1, 2, 3, 0};
        solution.orderSwap(nums, 0,  3);
        int[] expected = {1, 2, 3, 0, 0};
        Assert.assertArrayEquals(expected, nums);
    }

    @Test
    public void run_solution1() {
        Solution solution = new Solution1();
        runTest(solution);
    }

    @Test
    public void run_solution2() {
        Solution solution = new Solution2();
        runTest(solution);
    }


    @Test
    public void run_solution3() {
        Solution solution = new Solution3();
        runTest(solution);
    }

    @Test
    public void run_solution4() {
        Solution solution = new Solution4();
        runTest(solution);
    }

    private void runTest(Solution solution) {
        int[] nums_1 = {0, 0, 1};
        solution.moveZeroes(nums_1);
        int[] expected_1 = {1, 0, 0};
        Assert.assertArrayEquals(nums_1, expected_1);
    }
}
