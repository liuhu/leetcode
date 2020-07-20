package me.liuhu.study.algorithm.binarysearch;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/20
 **/
public class Solution4 {

    /**
     * 查找最后一个小于等于给定值的元素
     *
     * @param a 由小到大的
     * @param n
     * @param value
     * @return
     */
    public int bsearch(int[] a, int n, int value) {
        int left = 0, right = n - 1, mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (a[mid] > value) {
                right = mid - 1;
            } else if (a[mid] <= value) {
                if((mid == n - 1) || a[mid + 1] > value) {
                    return mid;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }
}
