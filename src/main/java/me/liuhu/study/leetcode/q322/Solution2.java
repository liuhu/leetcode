package me.liuhu.study.leetcode.q322;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/22
 **/
public class Solution2 implements Solution {

    int ans = Integer.MAX_VALUE;

    @Override
    public int coinChange(int[] coins, int amount) {
        // 排序，优先用面额大的
        Arrays.sort(coins);
        dfs(coins, coins.length - 1, amount, 0);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    public void dfs(int[] coins, int index, int amount, int cnt) {
        if (index < 0) {
            return;
        }
        int max = amount / coins[index];
        // 多往少，因为硬币是从大到小的，所以是尽量用多的大的硬币
        for (int c = max; c >= 0; c--) {
            int newAmount = amount - c * coins[index];
            int newCoinCount = cnt + c;

            // newAmount == 0 时, 得到解答, 记录最小值
            // 剪枝是因为大面值硬币需要更多小面值硬币替换，继续减少一枚或几枚大硬币搜索出来的答案【如果有】肯定不会更优。
            if (newAmount == 0) {
                ans = Math.min(ans, newCoinCount);
                break;//剪枝1
            }

            // ans 已经有解，newCoinCount + 1 >= ans 后续的情况不用再考虑
            if (newCoinCount + 1 >= ans) {
                break; //剪枝2
            }
            dfs(coins, index - 1, newAmount, newCoinCount);
        }
    }


    public static void main(String[] args) {
        Solution solution = new Solution2();
        int[] c = new int[]{1};

        System.out.println(solution.coinChange(c, 3));
    }
}
