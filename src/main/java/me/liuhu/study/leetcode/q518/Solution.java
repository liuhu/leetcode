package me.liuhu.study.leetcode.q518;

/**
 * 518. 零钱兑换 II
 * https://leetcode-cn.com/problems/coin-change-2/
 * 输入: amount = 5, coins = [1, 2, 5]
 * 输出: 4
 * 解释: 有四种方式可以凑成总金额:
 * 5=5
 * 5=2+2+1
 * 5=2+1+1+1
 * 5=1+1+1+1+1
 *
 * @description:
 * @author: LiuHu
 * @create: 2020/7/24
 **/
public interface Solution {
    int change(int amount, int[] coins);
}
