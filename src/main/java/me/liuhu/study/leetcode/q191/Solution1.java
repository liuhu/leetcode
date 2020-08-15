package me.liuhu.study.leetcode.q191;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/8/15
 **/
public class Solution1 implements Solution {

    /**
     * Time: O(m), Space: O(1)
     * @param n
     * @return
     */
    @Override
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }
}
