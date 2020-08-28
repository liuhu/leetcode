package me.liuhu.study.leetcode.q905;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/8/28
 **/
public class Solution1 implements Solution {

    @Override
    public int[] sortArrayByParity(int[] A) {

        int i = 0;
        int j = 1;

        while (i < A.length) {
            if (A[i] % 2 == 0) {
                i++;
                j = i + 1;
                continue;
            }
            while (j < A.length) {
                if (A[j] % 2 == 0) {
                    int tmp = A[i];
                    A[i] = A[j];
                    A[j] = tmp;
                    i++;
                    break;
                } else {
                    j++;
                }
            }
            if (j == A.length) {
                return A;
            }
        }

        return A;
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int[] A = new int[]{0,2,1};
        solution1.sortArrayByParity(A);
    }
}
