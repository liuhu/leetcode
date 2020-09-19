package me.liuhu.study.leetcode.q404;

/**
 * 404. 左叶子之和
 * https://leetcode-cn.com/problems/sum-of-left-leaves/
 *
 * @description:
 * @author: LiuHu
 * @create: 2020/9/19
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

    int sumOfLeftLeaves(TreeNode root);
}
