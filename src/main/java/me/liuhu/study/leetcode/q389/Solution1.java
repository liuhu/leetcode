package me.liuhu.study.leetcode.q389;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/8/24
 **/
public class Solution1 implements Solution {

    @Override
    public char findTheDifference(String s, String t) {
        int sum_s = 0, sum_t = 0;
        for(char c : s.toCharArray()) sum_s = sum_s + c;
        for(char c : t.toCharArray()) sum_t = sum_t + c;
        return (char) (sum_t - sum_s);
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.findTheDifference(null, "1"));
    }
}
