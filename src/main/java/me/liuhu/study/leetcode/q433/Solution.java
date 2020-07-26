package me.liuhu.study.leetcode.q433;

/**
 * 433. 最小基因变化
 * https://leetcode-cn.com/problems/minimum-genetic-mutation/
 *
 * start: "AACCGGTT"
 * end:   "AAACGGTA"
 * bank: ["AACCGGTA", "AACCGCTA", "AAACGGTA"]
 * 返回值: 2
 *
 * @description:
 * @author: LiuHu
 * @create: 2020/7/22
 **/
public interface Solution {

    int minMutation(String start, String end, String[] bank);
}
