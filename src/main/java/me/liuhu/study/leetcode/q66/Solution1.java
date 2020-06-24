package me.liuhu.study.leetcode.q66;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/24
 **/
public class Solution1 implements Solution {

    /**
     * 时间复杂度 O(n)
     * 空间复杂度 O(n)
     * @param digits
     * @return
     */
    @Override
    public int[] plusOne(int[] digits) {

        int[] results = new int[digits.length];

        // 是否需要进位
        boolean isCarryBit = false;
        // 是否超过长度
        boolean isOverSize = false;

        // 先计算个位情况
        int first = digits[digits.length - 1] + 1;
        if (first > 9) {
            isCarryBit = true;
            results[digits.length - 1] = 0;
            if (digits.length == 1) {
                isOverSize = true;
            }
        } else {
            results[digits.length - 1] = first;
        }

        // 十位以及之后的数组
        for (int i = digits.length - 2; i >= 0; i--) {
            if (!isCarryBit) {
                results[i] = digits[i];
            } else {
                int result = digits[i] + 1;
                if (result > 9) {
                    isCarryBit = true;
                    results[i] = 0;
                    // 最高位还要进位
                    if (i == 0) {
                        isOverSize = true;
                    }
                } else {
                    results[i] = result;
                    isCarryBit = false;
                }
            }
        }
        // 最高位要进位，数组空间不够
        if (isOverSize) {
            return overSizeResults(results);
        }
        return results;
    }

    private int[] overSizeResults(int[] results) {
        int[] newResults = new int[results.length + 1];
        newResults[0] = 1;
        for (int i = 0; i < results.length - 1; i++) {
            newResults[i + 1] = results[i];
        }
        return newResults;
    }
}
