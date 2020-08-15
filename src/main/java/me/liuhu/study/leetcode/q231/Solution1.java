package me.liuhu.study.leetcode.q231;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/8/15
 **/
public class Solution1 implements Solution {

    @Override
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
