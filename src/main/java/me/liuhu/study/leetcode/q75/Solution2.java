package me.liuhu.study.leetcode.q75;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/23
 **/
public class Solution2 implements Solution {
    @Override
    public void sortColors(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>(3);
        for(int num : nums) {
            count.compute(num, (k, v) -> null == v ? 1 : v + 1);
        }

        int k = 0;
        for(int key : count.keySet()) {
            for (int i = 0; i < count.get(key); i++) {
                nums[k] = key;
                k++;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution2();
        solution.sortColors(new int[]{0,0,2,1,0});
    }
}
