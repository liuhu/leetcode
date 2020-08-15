package me.liuhu.study.algorithm.sort;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/8/15
 **/
public class InsertionSort {
    /**
     * 插入排序
     *
     * @param nums
     */
    public static void insertionSort(int[] nums) {
        int length = nums.length;
        if (length <= 1) {
            return;
        }

        for (int i = 1; i < length; i++) {
            int value = nums[i];
            int j = i - 1;
            // 查找插入的位置
            while (j >= 0) {
                if (nums[j] > value) {
                    nums[j + 1] = nums[j];  // 数据移动
                    j--;
                } else {
                    break;
                }
            }
            nums[j + 1] = value; // 插入数据
        }
    }
}
