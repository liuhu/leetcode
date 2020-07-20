package me.liuhu.study.leetcode.q455;

import java.util.Arrays;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/20
 **/
public class Solution2_1 implements Solution {
    @Override
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g); // 孩子
        Arrays.sort(s); // 饼干

        int count = 0;
        int gi = 0;

        for (int _s : s) {
            if (gi >= g.length) {
                break;
            }
            if (_s >= g[gi]) {
                count ++;
                gi ++;
            }
        }

        return count;
    }
}
