package me.liuhu.study.leetcode.q347;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/9/7
 **/
public class Solution2_5 implements Solution {

    @Override
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.compute(num, (key, v) -> null == v ? 1 : v + 1);
        }

        Queue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((v1, v2) -> v2.getValue() - v1.getValue());
        count.entrySet().forEach(x -> queue.add(x));
        for (int i = 0; i < k; i++) result[i] = queue.poll().getKey();
        return result;
    }
}
