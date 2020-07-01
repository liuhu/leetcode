package me.liuhu.study.leetcode.q49;

import java.util.*;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/30
 **/
public class Solution1 implements Solution {

    /**
     * Time: 每个字符串需要排序 O(KlogK)，一共要排 N 次，则时间复杂度为 O(NKlogK)
     * Space: O(NK)
     * @param strs
     * @return
     */
    @Override
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();

        for (String str : strs) {
            result.compute(sortStr(str), (k, v) -> {
                if (null == v) {
                    v = new ArrayList<>();
                }
                v.add(str);
                return v;
            });
        }
        return new ArrayList<>(result.values());
    }

    private String sortStr(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }
}
