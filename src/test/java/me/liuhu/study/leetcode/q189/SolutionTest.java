package me.liuhu.study.leetcode.q189;

import org.junit.Assert;
import org.junit.Test;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/27
 **/
public class SolutionTest {

    @Test
    public void run_solution4() {
        Solution solution = new Solution1();
        runTest(solution);
    }

    private void runTest(Solution solution) {
        int[] nums_1 = {1,2,3,4,5,6,7};
        solution.rotate(nums_1, 1);
        int[] expected_1 = {7,1,2,3,4,5,6};
        Assert.assertArrayEquals(nums_1, expected_1);
    }
}
