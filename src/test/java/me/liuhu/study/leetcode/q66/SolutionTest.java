package me.liuhu.study.leetcode.q66;

import org.junit.Assert;
import org.junit.Test;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/12
 **/
public class SolutionTest {

    @Test
    public void run1() {
        System.out.println("run test ... ");
        Solution solution = new Solution1();
        runTest(solution);
    }

    @Test
    public void run2() {
        System.out.println("run test ... ");
        Solution solution = new Solution2();
        runTest(solution);
    }


    private void runTest(Solution solution) {
        int[] digits = {1,2,3,4};
        int[] expected = {1,2,3,5};
        Assert.assertArrayEquals(expected, solution.plusOne(digits));


        int[] digits_2 = {9,9,9};
        int[] expected_2 = {1,0,0,0};
        Assert.assertArrayEquals(expected_2, solution.plusOne(digits_2));

        int[] digits_3 = {9};
        int[] expected_3 = {1,0};
        Assert.assertArrayEquals(expected_3, solution.plusOne(digits_3));

        int[] digits_4 = {8,9};
        int[] expected_4 = {9,0};
        Assert.assertArrayEquals(expected_4, solution.plusOne(digits_4));


    }
}
