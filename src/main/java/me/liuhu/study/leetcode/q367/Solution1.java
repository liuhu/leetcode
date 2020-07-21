package me.liuhu.study.leetcode.q367;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/21
 **/
public class Solution1 implements Solution {

    @Override
    public boolean isPerfectSquare(int num) {
        long left = 0, right = num, mid;

        while (left <= right) {
            mid = left + ((right - left) >> 1);
            long tmp = mid * mid;
            if (tmp == num) {
                return true;
            } else if (tmp > num) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}
