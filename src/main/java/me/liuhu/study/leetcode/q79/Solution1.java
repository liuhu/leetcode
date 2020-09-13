package me.liuhu.study.leetcode.q79;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/9/13
 **/
public class Solution1 implements Solution {
    @Override
    public boolean exist(char[][] board, String word) {
        int h = board.length, w = board[0].length;
        boolean[][] used = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                boolean flag = dfs(board, used, word.toCharArray(), i, j, 0);
                if (flag) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, boolean[][] used, char[] word, int i, int j, int deep) {
        if (board[i][j] != word[deep]) {
            return false;
        } else if (deep == word.length - 1) {
            return true;
        }

        used[i][j] = true;
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        boolean result = false;
        for (int[] dir : directions) {
            int newi = i + dir[0], newj = j + dir[1];
            if (newi >= 0 && newi < board.length && newj >= 0 && newj < board[0].length) {
                if (!used[newi][newj]) {
                    boolean flag = dfs(board, used, word, newi, newj, deep + 1);
                    if (flag) {
                        result = true;
                        break;
                    }
                }
            }
        }
        used[i][j] = false;
        return result;

    }
}
