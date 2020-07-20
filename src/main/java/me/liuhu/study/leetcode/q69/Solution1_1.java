package me.liuhu.study.leetcode.q69;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/20
 **/
public class Solution1_1 implements Solution {

    @Override
    public int mySqrt(int x) {
        long left = 0, right = x, mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            long tmp = mid * mid;
            if (tmp > x) {
                right = mid - 1;
            } else if (tmp < x) {
                left = left + 1;
            } else {
                return (int) mid;
            }
        }
        return (int)right;
    }
}
