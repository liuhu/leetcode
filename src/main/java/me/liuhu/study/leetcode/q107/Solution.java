package me.liuhu.study.leetcode.q107;

import java.util.List;

/**
 * 107. 二叉树的层次遍历 II
 * https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii/
 *
 * 给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其自底向上的层次遍历为：
 * [
 *   [15,7],
 *   [9,20],
 *   [3]
 * ]
 *
 * @description:
 * @author: LiuHu
 * @create: 2020/9/6
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

    List<List<Integer>> levelOrderBottom(TreeNode root);
}
