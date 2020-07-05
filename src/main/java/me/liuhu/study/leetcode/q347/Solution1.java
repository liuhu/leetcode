package me.liuhu.study.leetcode.q347;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/5
 **/
public class Solution1 implements Solution {
    @Override
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> map = new HashMap<>(nums.length);

        for (int num : nums) {
            map.compute(num, (_k, _v) -> null == _v ? 1 : _v + 1);
        }

        List<Map.Entry<Integer, Integer>> res = map.entrySet().stream().sorted(Comparator.comparingInt(Map.Entry::getValue))
                .collect(Collectors.toList());
        for (int i = 0; i < k; i++) {
            result[i] = res.get(res.size() - i - 1).getKey();
        }
        return result;
    }
}
