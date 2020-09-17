package me.liuhu.study.leetcode.q91;

/**
 * 91. 解码方法
 * https://leetcode-cn.com/problems/decode-ways/
 * 一条包含字母A-Z 的消息通过以下方式进行了编码：
 *
 * 'A' -> 1
 * 'B' -> 2
 * ...
 * 'Z' -> 26
 * 给定一个只包含数字的非空字符串，请计算解码方法的总数。
 *
 * 示例 1:
 * 输入: "12"
 * 输出: 2
 * 解释:它可以解码为 "AB"（1 2）或者 "L"（12）。
 *
 *
 * @description:
 * @author: LiuHu
 * @create: 2020/7/31
 **/
public interface Solution {
    int numDecodings(String s);
}
