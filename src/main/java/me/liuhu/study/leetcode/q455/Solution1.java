package me.liuhu.study.leetcode.q455;

import java.util.Arrays;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/19
 **/
public class Solution1 implements Solution {

    @Override
    public int findContentChildren(int[] g, int[] s) {
        // 孩子, 优先分配胃口小的
        Arrays.sort(g);
        // 饼干, 优先使用小饼干
        Arrays.sort(s);

        int gi = 0, si = 0;
        while(gi < g.length && si < s.length){
            if(g[gi] <= s[si]) {
                gi++;
            }
            si++;
        }
        return gi;
    }
}
