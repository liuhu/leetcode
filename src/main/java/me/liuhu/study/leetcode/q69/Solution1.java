package me.liuhu.study.leetcode.q69;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/20
 **/
public class Solution1 implements Solution {

    @Override
    public int mySqrt(int x) {
        int left = 0, right = x;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            long tmp = mid * mid;
            if (tmp < x) {
                left = mid + 1;
            } else if (tmp > x) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        Solution solution = new Solution1();
        System.out.println(solution.mySqrt(10000));
    }
}
