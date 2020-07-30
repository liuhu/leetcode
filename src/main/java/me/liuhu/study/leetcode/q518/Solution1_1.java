package me.liuhu.study.leetcode.q518;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/24
 **/
public class Solution1_1 implements Solution {
    @Override
    public int change(int amount, int[] coins) {
        int[][] d = new int[coins.length + 1][amount + 1];
        for (int i = 0; i <= coins.length; ++i) d[i][0] = 1;

        for (int i = 0; i < coins.length + 1; i++) {
            for (int j = 0; j < amount + 1; j++) {
                System.out.printf(String.valueOf(d[i][j]));
            }
            System.out.println();
        }

        for (int i = 1; i <= coins.length; ++i) {
            for (int j = 1; j <= amount; ++j) {
                System.out.println("i = " + i + " j = " + j);
                System.out.println("d[i][j-coins[i-1]] => " + "d[" + i + "][" + (j - coins[i - 1]) + "] = " + (j >= coins[i - 1] ? d[i][j - coins[i - 1]] : 0));
                System.out.println("d[i-1][j] =>" + " d[" + (i - 1) + "][" + j + "] = " + d[i - 1][j]);

                int useCurCoin = j >= coins[i - 1] ? d[i][j - coins[i - 1]] : 0;
                d[i][j] = d[i - 1][j] + useCurCoin;
                System.out.println("d[i][j] => " + "d[" + i + "][" + j + "] = " + d[i][j]);
            }
        }

        for (int i = 0; i < coins.length + 1; i++) {
            for (int j = 0; j < amount + 1; j++) {
                System.out.printf(String.valueOf(d[i][j]));
            }
            System.out.println();
        }

        return d[coins.length][amount];
    }


    public int change2(int amount, int[] coins) {
        return helper(coins, 0, amount);
    }

    private int helper(int[] coins, int start, int amount) {
        if (amount == 0) {
            return 1;
        }
        if (amount < 0) {
            return 0;
        }
        int result = 0;
        for (int i = start; i < coins.length; ++i) {
            result += helper(coins, i, amount - coins[i]);
        }
        return result;
    }

    public int change3(int amount, int[] coins) {
        int res = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(amount);
        // 辅助队列，记录下一次 coin 开始可用第 idx
        Queue<Integer> coinStart = new LinkedList<>();
        coinStart.add(0);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Integer count = queue.poll();
                Integer idx = coinStart.poll();
                for (int j = idx; j < coins.length; j++) {
                    int newCount = count - coins[j];
                    if (newCount == 0) {
                        res ++;
                    } else if (newCount > 0) {
                        queue.add(newCount);
                        coinStart.add(j);
                    }
                }
            }
        }
        return res;
    }


    public static void main(String[] args) {
        Solution1_1 solution = new Solution1_1();
        System.out.println(solution.change(5, new int[]{1, 2, 5}));
        System.out.println(solution.change2(100, new int[]{1, 2, 5}));
        System.out.println(solution.change3(100, new int[]{1, 2, 5}));

    }
}
