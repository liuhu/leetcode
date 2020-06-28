package me.liuhu.study.leetcode.q20;


import org.junit.Assert;
import org.junit.Test;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/28
 **/
public class SolutionTest {

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

    private void runTest(Solution solution) {
        Assert.assertFalse(solution.isValid("("));
        Assert.assertTrue(solution.isValid(""));
        Assert.assertTrue(solution.isValid("[]{}()"));
        Assert.assertFalse(solution.isValid("([]"));

    }
}
