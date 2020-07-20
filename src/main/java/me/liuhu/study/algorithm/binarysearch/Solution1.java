package me.liuhu.study.algorithm.binarysearch;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/20
 **/
public class Solution1 {

    /**
     * 查找第一个值等于给定值的元素
     *
     * @param a 由小到大的
     * @param n
     * @param value
     * @return
     */
    public int bsearch(int[] a, int n, int value) {
        int low = 0, high = n - 1, mid;
        while (low <= high) {
            mid = low + ((high - low) >> 1);
            if (a[mid] > value) {
                high = mid - 1;
            } else if (a[mid] < value) {
                low = mid + 1;
            } else {
                // 如果 mid 等于 0，那这个元素已经是数组的第一个元素，那它肯定是我们要找的；
                // a[mid]的前一个元素 a[mid-1]不等于 value，那也说明 a[mid]就是我们要找的第一个值等于给定值的元素。
                if ((mid == 0) || (a[mid - 1] != value)) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
