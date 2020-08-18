package me.liuhu.study.leetcode.q387;

import java.util.*;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/8/18
 **/
public class Solution1 implements Solution {

    @Override
    public int firstUniqChar(String s) {
        if (null == s || s.length() == 0) {
            return -1;
        }
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>(100, 0.75f,false);
        for (char c : s.toCharArray()) {
            map.compute(c, (k, v) -> null == v ? 1 : v + 1);
        }

        Iterator<Map.Entry<Character, Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<Character, Integer> entry = iterator.next();
            if (entry.getValue() == 1) {
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == entry.getKey()) {
                        return j;
                    }
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        solution1.firstUniqChar("leetcode");
    }
}
