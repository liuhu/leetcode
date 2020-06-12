package me.liuhu.study.leetcode.q15;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/12
 **/
public class Solution2 implements Solution {


    @Override
    public List<List<Integer>> threeSum(int[] nums) {
        Map<Integer, List<Integer>> resultMap = new HashMap<>();
        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        // 小到大排序
        numsList.sort(Integer::compareTo);

        for (int i = 0; i < nums.length; i++) {
            if (numsList.get(i) > 0) {
                break;
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (numsList.get(i) + numsList.get(j) > 0) {
                    break;
                }
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = numsList.get(i) + numsList.get(j) + numsList.get(k);
                    if (sum == 0) {
                        List<Integer> result = Arrays.asList(numsList.get(i), numsList.get(j), numsList.get(k));
                        resultMap.put(hashCodeForList(result), result);
                    } else if (sum > 0) { // 因为是从小到大排序好的，所以一旦 >0 就可以跳出循环
                        break;
                    }
                }
            }
        }

        return new ArrayList<>(resultMap.values());
    }

    /**
     * 计算 List 的 hashCode 用于比较是否存在相同解
     * @param nums
     * @return
     */
    private static int hashCodeForList(List<Integer> nums) {
        nums.sort(Integer::compareTo);
        return nums.hashCode();
    }
}
