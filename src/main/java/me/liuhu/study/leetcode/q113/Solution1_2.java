package me.liuhu.study.leetcode.q113;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/8/27
 **/
public class Solution1_2 implements Solution {

    @Override
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(result, root, sum, new ArrayList<>());
        return result;
    }

    public void dfs(List<List<Integer>> result, TreeNode treeNode, int sum, List<Integer> path) {
        if (treeNode == null) {
            return;
        }
        path.add(treeNode.val);
        if (treeNode.left == null && treeNode.right == null && sum == treeNode.val) {
            result.add(new ArrayList<>(path));
        }
        dfs(result, treeNode.right, sum - treeNode.val, path);
        dfs(result, treeNode.left, sum - treeNode.val, path);
        path.remove(path.size() - 1);
    }
}
