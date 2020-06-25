package me.liuhu.study.leetcode.q283;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/23
 **/
public class Solution2 implements Solution {

    /**
     * 题目本身有个限定，只要将非 0 的数据按顺序集中在数组左端，
     * 后面的数据都给 0 即可
     *
     * 时间复杂度 O(n)
     * 空间复杂度 O(1)
     * @param nums
     */
    @Override
    public void moveZeroes(int[] nums) {
        Object[] aa = new Object[10];
        aa[0] = Arrays.asList("1", "2", "3");
        aa[1] = "abc";
        aa[2] = 123L;
        System.out.println(aa);
    }

    public static void main(String[] args) {
        Solution2 d = new Solution2();

        d.moveZeroes(null);
    }
}
