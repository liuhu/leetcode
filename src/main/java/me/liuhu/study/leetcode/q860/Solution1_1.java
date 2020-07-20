package me.liuhu.study.leetcode.q860;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/20
 **/
public class Solution1_1 implements Solution {
    @Override
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;

        for(int bill : bills) {
            if (bill == 5) {
                five ++;
            } else if (bill == 10) {
                if (five < 1) {
                    return false;
                }
                five --;
                ten ++;
            } else {
                if (ten > 0 && five > 0) {
                    ten --;
                    five --;
                } else {
                    if (five < 3) {
                        return false;
                    }
                    five = five - 3;
                }
            }
        }
        return true;
    }
}
