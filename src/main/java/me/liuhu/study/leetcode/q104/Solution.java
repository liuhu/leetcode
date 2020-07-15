package me.liuhu.study.leetcode.q104;

/**
 * 104. 二叉树的最大深度
 * @description:
 * @author: LiuHu
 * @create: 2020/7/15
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

    int maxDepth(TreeNode root);
}
