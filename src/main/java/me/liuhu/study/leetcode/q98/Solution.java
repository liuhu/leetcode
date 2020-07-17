package me.liuhu.study.leetcode.q98;

/**
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

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    boolean isValidBST(TreeNode root);
}
