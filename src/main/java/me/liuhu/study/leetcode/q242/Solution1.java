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
     * Space: O(1), 虽然新开了两个MAP, 但是 s、t 都是仅包含字母，所以MAP容量是固定的
     * @param s
     * @param t
     * @return
     */
    @Override
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<>(26);
        Map<Character, Integer> tMap = new HashMap<>(26);

        for(char _s : s.toCharArray()) {
            sMap.compute(_s, (k, v) -> null == v ? 1 : v + 1);
        }

        for(char _t : t.toCharArray()) {
            tMap.compute(_t, (k, v) -> null == v ? 1 : v + 1);
        }

        return sMap.equals(tMap);
    }
}
