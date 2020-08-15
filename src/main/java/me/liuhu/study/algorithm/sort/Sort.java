package me.liuhu.study.algorithm.sort;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/8/15
 **/
public class Sort {
    /**
     * 冒泡排序
     *
     * @param nums
     */
    public static void bubbleSort(int[] nums) {
        int length = nums.length;
        if (length <= 1) {
            return;
        }
        for (int i = 0; i < length; i++) {
            // 提前退出冒泡循环的标志位
            boolean flag = false;
            for (int j = length - 1; j > i; j--) {
                if (nums[j] > nums[j - 1]) { // 交换
                    int tmp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = tmp;
                    flag = true;  // 表示有数据交换
                }
            }
            if (!flag) {
                break;  // 没有数据交换，提前退出
            }
        }
    }

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

    public static void main(String[] args) {
        int[] nums = new int[]{3, 5, 2, 4, 1};
        //bubbleSort(nums);
        insertionSort(nums);
        for (int num : nums) System.out.println(num);
    }
}
