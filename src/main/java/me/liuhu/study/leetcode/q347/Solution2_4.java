package me.liuhu.study.leetcode.q347;

import java.util.*;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/13
 **/
public class Solution2_4 implements Solution {

    @Override
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.compute(num, (_k, _v) -> null == _v ? 1 : _v + 1);
        }

        Queue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((v1, v2) -> v2.getValue() - v1.getValue());
        queue.addAll(map.entrySet());

        for (int i = 0; i < k ; i++) {
            result[i] = queue.poll().getKey();
        }
        return result;
    }
}
