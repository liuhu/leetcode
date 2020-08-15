package me.liuhu.study.algorithm.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/8/15
 **/
public class HeapSort {

    /**
     * 堆排序
     * @param nums 待排序数组
     */
    public static void heapSort(int[] nums) {
        int length = nums.length;
        //初始化大顶堆
        for (int i = (length - 2) / 2; i >= 0; i--) {
            adjustHeap(nums, i, length);
        }

        //每次取堆顶元素与堆尾元素交换，再重新调整成大顶堆
        for (int i = length - 1; i > 0; i--) {
            int temp = nums[0];
            nums[0] = nums[i];
            nums[i] = temp;
            adjustHeap(nums, 0, i);
        }
    }

    /**
     * 调整堆->大顶堆
     *
     * @param nums  待排序数组
     * @param top    堆顶元素下标
     * @param length 待调整的堆长度
     */
    public static void adjustHeap(int[] nums, int top, int length) {
        int temp = nums[top]; //暂存堆顶元素
        //比较左右子树根结点，从大的子树向下遍历调整堆
        for (int i = 2 * top + 1; i < length; i = i * 2 + 1) {
            //保证i为较大的子树下标
            if (i < length - 1 && nums[i] < nums[i + 1]) {
                i++;
            }
            if (temp > nums[i]) {
                break;
            }
            nums[top] = nums[i];
            top = i;//向下搜索
        }
        nums[top] = temp;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1};
        heapSort(nums);
        for (int num : nums) System.out.println(num);
    }
}
