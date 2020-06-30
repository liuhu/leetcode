package me.liuhu.study.leetcode.q242;


import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/30
 **/
public class Solution1 implements Solution {

    /**
     * 统计 s 中每个字母的个数, 再统计 t 中每个字母的个数，比较两个统计结果
     * Time: O(n), 两个 for 循环 + Map 的 equals 方法是一次 Map 遍历
     * Space: O(s + t), 新开了两个MAP
     * @param s
     * @param t
     * @return
     */
    @Override
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for(char _s : s.toCharArray()) {
            sMap.compute(_s, (k, v) -> null == v ? 1 : v + 1);
        }

        for(char _t : t.toCharArray()) {
            tMap.compute(_t, (k, v) -> null == v ? 1 : v + 1);
        }

        return sMap.equals(tMap);
    }
}
