package me.liuhu.study.leetcode.q290;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/8/29
 **/
public class Solution1 implements Solution {
    @Override
    public boolean wordPattern(String pattern, String str) {
        if (null == pattern || null == str) {
            return false;
        }
        char[] p = pattern.toCharArray();
        String[] s = str.split(" ");
        if (p.length != s.length) {
            return false;
        }
        Map<Character, String> map_p = new HashMap<>();
        Map<String, Character> map_s = new HashMap<>();
        for (int i = 0; i < p.length; i++) {
            String s1 = map_p.get(p[i]);
            if (s1 == null) {
                if (map_s.get(s[i]) != null) {
                    return false;
                } else {
                    map_p.put(p[i], s[i]);
                    map_s.put(s[i], p[i]);
                }
            } else if (!s1.equals(s[i])) {
                return false;
            }
        }
        return true;
    }
}
