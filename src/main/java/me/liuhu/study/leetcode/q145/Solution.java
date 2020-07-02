package me.liuhu.study.leetcode.q145;

import java.util.List;

/**
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

        TreeNode(int x, TreeNode left, TreeNode right) {
            val = x;
            this.left = left;
            this.right = right;
        }
    }

    List<Integer> postorderTraversal(TreeNode root);
}
