package me.liuhu.study.leetcode.q226;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/6
 **/
public class Solution1_2 implements Solution {


    @Override
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);
        root.left = right;
        root.right = left;
        return root;
    }
}
