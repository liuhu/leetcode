package me.liuhu.study.leetcode.q347;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/5
 **/
public class Solution2 implements Solution {
    @Override
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> map = new HashMap<>(nums.length);

        for (int num : nums) {
            map.compute(num, (_k, _v) -> null == _v ? 1 : _v + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((v1, v2) -> v2.getValue() - v1.getValue());
        queue.addAll(map.entrySet());
        for (int i = 0; i < k; i++) {
            result[i] = queue.poll().getKey();
        }
        return result;
    }
}
