package me.liuhu.study.leetcode.q239;

import java.util.ArrayDeque;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/28
 **/
public class Solution1 implements Solution {


    /**
     * 暴力解法
     * Time: O(n*k)
     * Space: O(1) 不包含结果
     * @param nums
     * @param k
     * @return
     */
    @Override
    public int[] maxSlidingWindow(int[] nums, int k) {
        // 结果集合
        int[] result = new int[nums.length + 1 - k];
        int i = 0;
        ArrayDeque<Integer> queue = new ArrayDeque(k);
        for (int num : nums) {
            if (queue.size() < k) {
                queue.addFirst(num);
            }
            if (queue.size() == k) {
                result[i++] = queue.stream().max(Integer::compareTo).get();
                queue.pollLast();
            }
        }
        return result;
    }
}
