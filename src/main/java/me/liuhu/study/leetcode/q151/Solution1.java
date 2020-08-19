package me.liuhu.study.leetcode.q151;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/8/19
 **/
public class Solution1 implements Solution {
    @Override
    public String reverseWords(String s) {
        if (null == s) {
            return null;
        }
        StringBuilder stringBuffer = new StringBuilder();
        String[] strArray = s.trim().split(" ");
        for (int i = strArray.length - 1; i >= 0; i--) {
            if (!"".equals(strArray[i])) {
                stringBuffer.append(strArray[i]);
                if (i != 0) {
                    stringBuffer.append(" ");
                }
            }
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        solution1.reverseWords(" a good   example ");
    }
}
