package me.liuhu.study.leetcode.q3;


import org.junit.Assert;
import org.junit.Test;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/11
 **/
public class SolutionTest {

    @Test
    public void runFoo2() {
        System.out.println("run test ... ");
        Solution solution = new Solution1();

        Assert.assertEquals(7, solution.lengthOfLongestSubstring("abc123s"));
        Assert.assertEquals(5, solution.lengthOfLongestSubstring("abcc1234"));
        Assert.assertEquals(6, solution.lengthOfLongestSubstring("abc123312"));


    }
}
