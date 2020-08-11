package me.liuhu.study.leetcode.q226;

/**
 * 226. 翻转二叉树
 * https://leetcode-cn.com/problems/invert-binary-tree/
 *
 * @description:
 * @author: LiuHu
 * @create: 2020/7/1
 **/
public interface Solution {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    TreeNode invertTree(TreeNode root);
}
