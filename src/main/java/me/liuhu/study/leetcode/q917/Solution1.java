package me.liuhu.study.leetcode.q917;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/8/20
 **/
public class Solution1 implements Solution {

    @Override
    public String reverseOnlyLetters(String S) {
        char[] chars = S.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        for (int k = i; k < j; k++) {
            while (!Character.isLetter(chars[i]) && i < j) {
                i ++;
            }
            while (!Character.isLetter(chars[j]) && j > i) {
                j --;
            }
            if (i >= j) {
                break;
            }
            char tmp = chars[i];
            chars[i] = chars[j];
            chars[j] = tmp;
            i ++;
            j --;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        solution1.reverseOnlyLetters("7_28]");
    }
}
