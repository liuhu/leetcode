package me.liuhu.study.algorithm.binarysearch;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/20
 **/
public class Solution2 {

    /**
     * 查找最后一个值等于给定值的元素
     *
     * @param a 由小到大的
     * @param n
     * @param value
     * @return
     */
    public int bsearch(int[] a, int n, int value) {
        int left = 0, right = a.length - 1, mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (a[mid] > value) {
                right = mid - 1;
            } else if (a[mid] < value) {
                left = mid + 1;
            } else {
                // mid 是最后一个元素
                // 或者 mid 的后一个值不是 value
                if (mid == n - 1 || value != a[mid + 1]) {
                    return mid;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }
}
