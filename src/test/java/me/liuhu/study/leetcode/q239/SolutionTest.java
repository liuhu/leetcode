package me.liuhu.study.leetcode.q239;

import org.junit.Assert;
import org.junit.Test;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/27
 **/
public class SolutionTest {

    @Test
    public void run_solution1() {
        Solution solution = new Solution1();
        runTest(solution);
    }


    private void runTest(Solution solution) {
        int[] nums_1 = {1,3,-1,-3,5,3,6,7};
        int[] expected_1 = {3,3,5,5,6,7};
        Assert.assertArrayEquals(solution.maxSlidingWindow(nums_1, 3), expected_1);
    }
}
