package me.liuhu.study.leetcode.q242;


/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/30
 **/
public class Solution3 implements Solution {

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
        if (s.length() != t.length()) {
            return false;
        }

        // 统计
        int[] counter = new int[26];

        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a'] ++;
            counter[t.charAt(i) - 'a'] --;
        }

        for(int c : counter) {
            if (c != 0) {
                return false;
            }
        }

        return true;
    }
}
