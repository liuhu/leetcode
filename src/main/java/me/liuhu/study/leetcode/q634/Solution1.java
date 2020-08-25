package me.liuhu.study.leetcode.q634;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/8/25
 **/
public class Solution1 implements Solution {
    @Override
    public int findDerangement(int n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return 0;
        int MOD = 1_000_000_000 + 7;
        int[] d = new int[n + 1];
        d[1] = 0;
        d[2] = 1;
        for (int i = 3; i <= n; i++) {
            d[i] = (int)((i - 1L) * (d[i - 1] + d[i - 2]) % MOD);
        }
        return d[n];
    }
}
