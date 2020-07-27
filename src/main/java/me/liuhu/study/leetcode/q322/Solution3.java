package me.liuhu.study.leetcode.q322;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/**
 * BFS
 * @description:
 * @author: LiuHu
 * @create: 2020/7/27
 **/
public class Solution3 implements Solution {

    @Override
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(amount);
        int step = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int curAmount = queue.poll();
                for(int coin : coins) {
                    int tmp = curAmount - coin;
                    if (tmp == 0) {
                        return step;
                    } else if (tmp > 0){
                        queue.add(tmp);
                    }
                }
            }
            step ++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution1();
        int[] c = new int[]{1,2,5};

        System.out.println(solution.coinChange(c, 100));
    }
}
