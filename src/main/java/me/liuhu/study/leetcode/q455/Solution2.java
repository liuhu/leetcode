package me.liuhu.study.leetcode.q455;

import java.util.Arrays;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/19
 **/
public class Solution2 implements Solution {

    @Override
    public int findContentChildren(int[] g, int[] s) {
        // 孩子, 优先分配胃口小的
        Arrays.sort(g);
        // 饼干, 优先使用小饼干
        Arrays.sort(s);

        int count = 0;
        int index = 0;

        for (int _s : s) {
            if (index > g.length - 1) {
                return count;
            }
            if (_s >= g[index]) {
                index ++;
                count ++;
            }
        }

        return count;
    }
}
