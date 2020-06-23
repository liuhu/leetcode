package me.liuhu.study.leetcode.q11;

import org.junit.Assert;
import org.junit.Test;


/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/12
 **/
public class SolutionTest {

    /**
     * 不可行，时间复杂度不符合要求 O{n*n*n}
     */
    @Test
    public void run1() {
        System.out.println("run test ... ");
        Solution solution = new Solution1();
        int area = runTest(solution);
        Assert.assertEquals(49, area);
    }

    @Test
    public void run2() {
        System.out.println("run test ... ");
        Solution solution = new Solution2();
        int area = runTest(solution);
        Assert.assertEquals(49, area);
    }

    private int runTest(Solution solution) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        return solution.maxArea(height);
    }
}
