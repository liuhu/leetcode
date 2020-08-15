package me.liuhu.study.algorithm.sort;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/8/15
 **/
public class QuickSort {

    public static void quickSort(int[] nums) {
        int length = nums.length;
        if (length <= 1) {
            return;
        }
        quickSort(nums, 0, length - 1);
    }

    public static void quickSort(int[] nums, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(nums, left, right);
            quickSort(nums, left, partitionIndex - 1);
            quickSort(nums, partitionIndex + 1, right);
        }
    }

    private static int partition(int[] nums, int left, int right) {
        // pivot: 标杆位置，counter: ⼩于pivot的元素的个数
        int pivot = right, counter = left;
        for (int i = left; i < right; i++) {
            if (nums[i] < nums[pivot]) {
                int temp = nums[counter];
                nums[counter] = nums[i];
                nums[i] = temp;
                counter++;
            }
        }
        int temp = nums[pivot];
        nums[pivot] = nums[counter];
        nums[counter] = temp;
        return counter;
    }
}
