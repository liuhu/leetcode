package me.liuhu.study.leetcode.q169;

import org.junit.Test;

import java.util.List;

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
        runTest(solution);
    }


    private void runTest(Solution solution) {
        long startTime = System.currentTimeMillis();

        int[] nums = {2,2,1,1,1,2,2};
        int result = solution.majorityElement(nums);
        System.out.println(result);

        System.out.println("耗费：" + (System.currentTimeMillis() - startTime));
    }
}
