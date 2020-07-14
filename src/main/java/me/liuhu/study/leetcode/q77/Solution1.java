package me.liuhu.study.leetcode.q77;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/14
 **/
public class Solution1 implements Solution {

    @Override
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if (k > n) {
            return result;
        }
        if (n <= 0) {
            return result;
        }
        List<Integer> nums = IntStream.range(1, n + 1).boxed().collect(Collectors.toList());

        dfs(new LinkedList<>(), nums, result, 0, k);

        return result;
    }

    public void dfs(LinkedList<Integer> path, List<Integer> nums, List<List<Integer>> result, int level, int k) {
        if (k == level) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = level; i < nums.size() ; i++) {
            // 剪枝
            if (path.size() > 0 && path.getLast() >= nums.get(i)) {
                continue;
            }
            path.addLast(nums.get(i));
            dfs(path, nums, result, level + 1, k);

            // 回溯
            path.removeLast();
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution1();
        List<List<Integer>> result = solution.combine(4,2);
        System.out.println(result);
    }
}
