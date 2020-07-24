package me.liuhu.study.leetcode.q322;


/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/22
 **/
public class Solution1 implements Solution {


    @Override
    public int coinChange(int[] coins, int amount) {
        return coinChange(0, coins, amount);
    }

    private int coinChange(int idxCoin, int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        if (idxCoin < coins.length && amount > 0) {
            int maxVal = amount / coins[idxCoin];
            int minCost = Integer.MAX_VALUE;
            for (int x = 0; x <= maxVal; x++) {
                if (amount >= x * coins[idxCoin]) {
                    int res = coinChange(idxCoin + 1, coins, amount - x * coins[idxCoin]);
                    if (res != -1) {
                        minCost = Math.min(minCost, res + x);
                    }
                }
            }
            return (minCost == Integer.MAX_VALUE) ? -1 : minCost;
        }
        return -1;
    }


    public static void main(String[] args) {
        Solution solution = new Solution1();
        int[] c = new int[]{1};

        System.out.println(solution.coinChange(c, 3));
    }
}
