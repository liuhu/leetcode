package me.liuhu.study.leetcode.q66;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/28
 **/
public class Solution2 implements Solution {

    /**
     * Time: O(n)
     * Space: O(1)
     * @param digits
     * @return
     */
    @Override
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for(int i = len - 1; i >= 0; i--) {
            digits[i] = (digits[i] + 1) % 10;
            if(digits[i] != 0) {
                return digits;
            }
        }
        digits = new int[len + 1];
        digits[0] = 1;
        return digits;
    }
}
