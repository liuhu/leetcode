package me.liuhu.study.leetcode.q860;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/19
 **/
public class Solution1 implements Solution {


    @Override
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;

        for (int bill : bills) {
            if (bill == 5) {
                five ++;
            } else if (bill == 10) {
                if (five < 1) {
                    return false;
                }
                five --;
                ten ++;
            } else { // bill == 20
                if (five > 0 && ten > 0) {
                    five--;
                    ten--;
                } else if (five >= 3) {
                    five = five - 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
