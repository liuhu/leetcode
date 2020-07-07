package me.liuhu.study.leetcode.q226;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/7
 **/
public class Solution1_3 implements Solution {
    @Override
    public TreeNode invertTree(TreeNode root) {
        if (null == root) {
            return null;
        }
        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);
        root.left = right;
        root.right = left;
        return root;
    }
}
