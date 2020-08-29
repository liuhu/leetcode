package me.liuhu.study.leetcode.q290;

/**
 * 290. 单词规律
 * https://leetcode-cn.com/problems/word-pattern/
 *
 * 给定一种规律 pattern 和一个字符串 str ，判断 str 是否遵循相同的规律。
 *
 * 这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应规律。
 *
 * 示例1:
 *
 * 输入: pattern = "abba", str = "dog cat cat dog"
 * 输出: true
 *
 *
 * @description:
 * @author: LiuHu
 * @create: 2020/8/29
 **/
public interface Solution {

    boolean wordPattern(String pattern, String str);
}
