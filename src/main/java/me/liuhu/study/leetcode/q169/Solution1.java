package me.liuhu.study.leetcode.q169;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/17
 **/
public class Solution1 implements Solution {


    @Override
    public int majorityElement(int[] nums) {
        Map<Integer, Long> counted =
                Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return counted.entrySet().stream()
                .sorted((c1, c2) -> c2.getValue().compareTo(c1.getValue()))
                .findFirst().get().getKey();
    }
}
