package me.liuhu.study.leetcode.q111;

/**
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
