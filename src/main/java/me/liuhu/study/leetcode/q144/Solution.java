package me.liuhu.study.leetcode.q144;

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
    }

    List<Integer> preorderTraversal(TreeNode root);
}
