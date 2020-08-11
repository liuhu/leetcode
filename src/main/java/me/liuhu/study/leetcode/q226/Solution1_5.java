package me.liuhu.study.leetcode.q226;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/8/10
 **/
public class Solution1_5 implements Solution {
    @Override
    public TreeNode invertTree(TreeNode root) {
        if (null != root) {
            TreeNode right = invertTree(root.right);
            TreeNode left = invertTree(root.left);

            root.left = right;
            root.right = left;
        }
        return root;
    }
}
