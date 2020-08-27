package me.liuhu.study.leetcode.q113;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/8/27
 **/
public class Solution1 implements Solution {

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
        if (treeNode.left == null && treeNode.right == null) {
            if (path.stream().mapToInt(Integer::intValue).sum() + treeNode.val == sum) {
                path.add(treeNode.val);
                result.add(new ArrayList<>(path));
                path.remove(path.size() - 1);
            }
        }
        path.add(treeNode.val);
        dfs(result, treeNode.left, sum, path);
        path.remove(path.size() - 1);

        path.add(treeNode.val);
        dfs(result, treeNode.right, sum, path);
        path.remove(path.size() - 1);
    }
}
