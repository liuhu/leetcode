package me.liuhu.study.leetcode.q126;

import java.util.*;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/22
 **/
public class Solution2 implements Solution {

    private Set<String> words = new HashSet<>();
    private Set<String> used = new HashSet<>();
    @Override
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> result = new ArrayList<>();
        words.addAll(wordList);
        bfs(result, beginWord, endWord);
        return result;
    }


    private void bfs(List<List<String>> result, String beginWord, String endWord) {
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);

        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String str = queue.poll();
                List<String> next = findNext(str);
                if (next.contains(endWord)) {
                    //result.get(level - 1).add(endWord);
                    //return;
                } else {
                    for(String s : next) {
                        if (result.size() <= level) {
                            result.add(new ArrayList<>());
                            result.get(level).add(beginWord);
                        }
                        result.get(level).add(s);
                        queue.add(s);
                    }
                }
            }
            level ++;
        }
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

    public static void main(String[] args) {
        Solution solution = new Solution2();
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot","dot","dog","lot","log","cog");

        List<List<String>> list = solution.findLadders(beginWord, endWord, wordList);

        System.out.println(list);
    }
}
