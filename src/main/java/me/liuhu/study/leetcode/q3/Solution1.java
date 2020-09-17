package me.liuhu.study.leetcode.q3;

import java.util.*;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/10
 **/
public class Solution1 implements Solution {


    @Override
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int maxLength = 0;
        for (int i = 0; i < chars.length; i++) {
            Set<Character> stringSet = new HashSet<>();
            for (int j = i; j < chars.length; j++) {
                int currentSize = stringSet.size();
                stringSet.add(chars[j]);
                // 存在相同的字符
                if (currentSize == stringSet.size()) {
                    if (currentSize > maxLength) {
                        maxLength = currentSize;
                    }
                    break;
                }
            }
            if (stringSet.size() > maxLength) {
                maxLength = stringSet.size();
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(16&18);
    }
}
