package me.liuhu.study.leetcode.q74;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/21
 **/
public class Solution1 implements Solution {

    @Override
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int left = 0, right = matrix.length * matrix[0].length - 1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            int row = mid / matrix[0].length;
            int column = mid % matrix[0].length;
            if (matrix[row][column] == target) {
                return true;
            } else if (matrix[row][column] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return false;
    }
}
