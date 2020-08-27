package me.liuhu.study.leetcode.q112;


/**
 * @description:
 * @author: LiuHu
 * @create: 2020/8/26
 **/
public class Solution2 implements Solution {

    @Override
    public boolean hasPathSum(TreeNode root, int sum) {
        return dfs(root, 0, sum);
    }

    private boolean dfs(TreeNode root, int path, int sum) {
        if (null == root) {
            return false;
        }
        if (root.right == null && root.left == null) {
            return path + root.val == sum;
        }
        return dfs(root.left, path + root.val, sum) || dfs(root.right, path + root.val, sum);
    }


    public static void main(String[] args) {
        Solution2 solution1 = new Solution2();
        TreeNode treeNode = new TreeNode(1);
        solution1.hasPathSum(treeNode, 0);
    }
}
