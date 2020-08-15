package me.liuhu.study.algorithm.sort;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/8/15
 **/
public class MergeSort {

    public static void mergeSort(int[] nums) {
        int length = nums.length;
        if (length <= 1) {
            return;
        }
        mergeSort(nums, 0, length - 1);
    }

    private static void mergeSort(int[] nums, int left, int right) {
        if (right <= left) {
            return;
        }
        int mid = (left + right) >> 1;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        merge(nums, left, mid, right);
    }

    private static void merge(int[] nums, int left, int mid, int right) {
        int[] tmp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        while (i <= mid && j <= right) {
            tmp[k++] = nums[i] <= nums[j] ? nums[i++] : nums[j++];
        }
        while (i <= mid) {
            tmp[k++] = nums[i++];
        }
        while (j <= right) {
            tmp[k++] = nums[j++];
        }
        System.arraycopy(tmp, 0, nums, left, tmp.length);
    }
}
