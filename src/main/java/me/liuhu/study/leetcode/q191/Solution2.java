package me.liuhu.study.leetcode.q191;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/8/15
 **/
public class Solution2 implements Solution {

    /**
     * Time: O(m), Space: O(1)
     * @param n
     * @return
     */
    @Override
    public int hammingWeight(int n) {
        int mask = 1, count = 0;
        while (mask != 0) {
            if ((n & mask) != 0) ++count;
            mask <<= 1;
        }
        return count;
    }
}
