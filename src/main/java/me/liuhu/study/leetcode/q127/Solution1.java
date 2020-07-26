package me.liuhu.study.leetcode.q127;

import java.util.*;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/26
 **/
public class Solution1 implements Solution {

    private Set<String> words = new HashSet<>();
    private Set<String> used = new HashSet<>();


    @Override
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        words.addAll(wordList);
        return bfs(beginWord, endWord);
    }

    private int bfs(String beginWord, String endWord) {
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);

        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String str = queue.poll();
                List<String> next = findNext(str);
                if (next.contains(endWord)) {
                    return level + 2;
                } else {
                    for(String s : next) {
                        queue.add(s);
                    }
                }
            }
            level ++;
        }
        return 0;
    }


    private List<String> findNext(String str) {
        List<String> next = new ArrayList<>();
        char[] letters = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for (int i = 0; i < str.length(); i++) {
            for (char l : letters) {
                char[] chars = str.toCharArray();
                chars[i] = l;
                String newStr = new String(chars);
                if (words.contains(newStr) && !used.contains(newStr)) {
                    next.add(newStr);
                    used.add(newStr);
                }
            }
        }
        return next;
    }
}
