package me.liuhu.study.leetcode.q111;

/**
 * 111. 二叉树的最小深度
 * https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/
 *
 * @description:
 * @author: LiuHu
 * @create: 2020/7/17
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

    int minDepth(TreeNode root);
}
