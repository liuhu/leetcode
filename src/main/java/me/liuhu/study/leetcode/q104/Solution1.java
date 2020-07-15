package me.liuhu.study.leetcode.q104;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/15
 **/
public class Solution1 implements Solution {
    @Override
    public int maxDepth(TreeNode root) {
        return dfs(root, 0);
    }

    public int dfs(TreeNode root, int level) {
        if (null == root) {
            return level;
        }
        int left = dfs(root.left, level + 1);
        int right = dfs(root.right, level + 1);

        return Math.max(left, right);
    }
}
