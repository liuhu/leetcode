package me.liuhu.study.leetcode.q127;

import java.util.List;

/**
 * 127. 单词接龙
 * https://leetcode-cn.com/problems/word-ladder/description/
 *
 * beginWord = "hit",
 * endWord = "cog",
 * wordList = ["hot","dot","dog","lot","log","cog"]
 * 输出: 5
 *
 * @description:
 * @author: LiuHu
 * @create: 2020/7/26
 **/
public interface Solution {
    int ladderLength(String beginWord, String endWord, List<String> wordList);
}
