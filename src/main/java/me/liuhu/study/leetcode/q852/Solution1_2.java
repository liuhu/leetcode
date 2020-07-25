package me.liuhu.study.leetcode.q852;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/25
 **/
public class Solution1_2 implements Solution {
    @Override
    public int peakIndexInMountainArray(int[] A) {
        int left = 0, right = A.length - 1, mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (A[mid - 1] < A[mid] && A[mid] > A[mid + 1]) {
                return mid;
            } else if (A[mid] < A[mid + 1] || A[mid] > A[mid - 1]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
