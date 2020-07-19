package me.liuhu.study.algorithm.binarysearch;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/18
 **/
public class Solution {

    public int binarySearch(int[] array, int target) {
        int left = 0, right = array.length - 1, mid;
        while (left <= right) {
            mid = (right - left) / 2 + left;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 2, 3, 4, 5};
        Solution solution = new Solution();
        solution.binarySearch(array, 1);
    }
}
