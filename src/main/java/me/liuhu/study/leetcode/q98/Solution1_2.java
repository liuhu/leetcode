package me.liuhu.study.leetcode.q98;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/17
 **/
public class Solution1_2 implements Solution {


    @Override
    public boolean isValidBST(TreeNode root) {
        if (null == root) {
            return true;
        }

        Integer min = min(root.right);
        Integer max = max(root.left);

        boolean left = true, right = true;
        if (null != max && root.val <= max) {
            left = false;
        }
        if (null != min && root.val >= min) {
            right = false;
        }
        return left && right && isValidBST(root.left) && isValidBST(root.right);
    }

    private Integer min(TreeNode root) {
        Integer min = null;
        TreeNode node = root;
        while (null != node) {
            min = node.val;
            node = node.left;
        }
        return min;
    }

    private Integer max(TreeNode root) {
        Integer max = null;
        TreeNode node = root;
        while (null != node) {
            max = node.val;
            node = node.right;
        }
        return max;
    }
}
