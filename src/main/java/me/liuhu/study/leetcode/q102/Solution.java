package me.liuhu.study.leetcode.q102;

import java.util.List;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/22
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

    List<List<Integer>> levelOrder(TreeNode root);
}
