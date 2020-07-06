package me.liuhu.study.leetcode.q49;

import java.util.*;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/6
 **/
public class Solution1_2 implements Solution {
    @Override
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] c = str.toCharArray();
            Arrays.sort(c);
            map.compute(String.valueOf(c), (k, v) -> {
                if (null == v) {
                    List<String> strings = new ArrayList<>();
                    strings.add(str);
                    return strings;
                } else {
                    v.add(str);
                    return v;
                }
            });
        }
        return new ArrayList<>(map.values());
    }
}
