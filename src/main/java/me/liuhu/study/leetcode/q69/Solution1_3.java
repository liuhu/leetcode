package me.liuhu.study.leetcode.q69;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/26
 **/
public class Solution1_3 implements Solution {


    @Override
    public int mySqrt(int x) {
        long left = 1, right = x, mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            long tmp = mid * mid;
            if (tmp == x) {
                return (int) mid;
            } else if (tmp > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return (int) right;
    }

    public static void main(String[] args) {
        Solution solution = new Solution1_3();
        System.out.println(solution.mySqrt(8));
    }
}
