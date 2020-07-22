package me.liuhu.study.leetcode.q515;

import java.util.List;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/22
 **/
public interface Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    List<Integer> largestValues(TreeNode root);
}
