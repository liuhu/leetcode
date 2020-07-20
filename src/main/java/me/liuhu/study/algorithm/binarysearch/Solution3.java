package me.liuhu.study.algorithm.binarysearch;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/20
 **/
public class Solution3 {

    /**
     * 查找第一个大于等于给定值的元素
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
            if (a[mid] >= value) {
                // mid 是第一个元素
                // mid 的前一个元素比value小
                if ((mid == 0) || (a[mid - 1] < value)) {
                    return mid;
                } else {
                    right = mid - 1;
                }
            } else if (a[mid] < value) {
                left = mid + 1;
            }
        }
        return -1;
    }
}
