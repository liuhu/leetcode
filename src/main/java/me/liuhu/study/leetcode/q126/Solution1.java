package me.liuhu.study.leetcode.q126;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/21
 **/
public class Solution1 implements Solution {


    @Override
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> result = new ArrayList<>();
        if (null == wordList || wordList.isEmpty()) {
            return result;
        }
        boolean[] used = new boolean[wordList.size()];
        List<String> path = new ArrayList<>();
        path.add(beginWord);
        dfs(path, beginWord, endWord, result, used, wordList);
        return result;
    }

    int min = Integer.MAX_VALUE;

    private void dfs(List<String> path, String beginWord, String endWord, List<List<String>> result, boolean[] used, List<String> wordList) {
        if (beginWord.equals(endWord)) {
            if (min > path.size()) {
                // 清除之前大的结果
                result.clear();
                min = path.size();
                result.add(new ArrayList<>(path));
            } else if (min == path.size()) {
                result.add(new ArrayList<>(path));
            }
            return;
        }

        for (int i = 0; i < wordList.size(); i++) {
            if (used[i]) {
                continue;
            }
            String str = wordList.get(i);
            if (!isOneDifferent(beginWord, str)) {
                continue;
            }

            path.add(str);
            used[i] = true;

            dfs(path, str, endWord, result, used, wordList);

            path.remove(path.size() - 1);
            used[i] = false;
        }
    }

    private boolean isOneDifferent(String w1, String w2) {
        char[] wc1 = w1.toCharArray();
        char[] wc2 = w2.toCharArray();
        int count = 0;
        for (int i = 0; i < wc1.length; i++) {
            if (wc1[i] != wc2[i]) {
                count ++;
            }
        }
        return count == 1;
    }
}
