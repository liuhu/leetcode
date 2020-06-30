package me.liuhu.study.leetcode.q242;


import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/30
 **/
public class Solution2 implements Solution {

    /**
     * 简化为 1 个 map
     * Time: O(n)
     * Space: O(1)
     * @param s
     * @param t
     * @return
     */
    @Override
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<>(26);

        for(char _s : s.toCharArray()) {
            sMap.compute(_s, (k, v) -> null == v ? 1 : v + 1);
        }

        for(char _t : t.toCharArray()) {
            sMap.compute(_t, (k, v) -> null == v ? -1 : v - 1);
        }

        for(Character _s : sMap.keySet()) {
            if (!sMap.get(_s).equals(0)) {
                return false;
            }
        }
        return true;
    }
}
