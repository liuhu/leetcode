package me.liuhu.study.leetcode.q37;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/9/15
 **/
public class Solution1 implements Solution {
    @Override
    public void solveSudoku(char[][] board) {
        dfs(board, 0, 0);
    }

    private boolean dfs(char[][] board, int row, int column) {
        if (column == 9) {
            // 穷举到最后一列的话就换到下一行重新开始。
            return dfs(board, row + 1, 0);
        }

        if (row == 9) {
            // 找到一个可行解，触发 base case
            return true;
        }

        for (int i = row; i < 9; i++) {
            for (int j = column; j < 9; j++) {
                if (board[i][j] != '.') {
                    return dfs(board, i, j + 1);
                }

                for (char ch = '1'; ch <= '9'; ch++) {
                    // 如果遇到不合法的数字，就跳过
                    if (!isValid(board, i, j, ch)) continue;

                    board[i][j] = ch;
                    // 如果找到一个可行解，立即结束
                    if (dfs(board, i, j + 1)) {
                        return true;
                    }
                    board[i][j] = '.';
                }
                // 穷举完 1~9，依然没有找到可行解，此路不通
                return false;
            }
        }
        return false;
    }

    // 判断 board[i][j] 是否可以填入 n
    private boolean isValid(char[][] board, int r, int c, char n) {
        for (int i = 0; i < 9; i++) {
            // 判断行是否存在重复
            if (board[r][i] == n) return false;
            // 判断列是否存在重复
            if (board[i][c] == n) return false;
            // 判断 3 x 3 方框是否存在重复
            if (board[(r / 3) * 3 + i / 3][(c / 3) * 3 + i % 3] == n) return false;
        }
        return true;
    }
}
