package me.liuhu.study.algorithm.sort;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/8/15
 **/
public class SelectionSort {
    public static void selectionSort(int[] nums) {
        int length = nums.length;
        if (length <= 1) {
            return;
        }
        for (int i = 0; i < length; i++) {
            int minIdx = i;
            for (int j = i; j < length; j++) {
                if (nums[minIdx] > nums[j]) {
                    minIdx = j;
                }
            }
            int tmp = nums[i];
            nums[i] = nums[minIdx];
            nums[minIdx] = tmp;
        }
    }
}
