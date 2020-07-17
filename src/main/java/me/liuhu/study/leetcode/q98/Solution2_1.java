package me.liuhu.study.leetcode.q98;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/17
 **/
public class Solution2_1 implements Solution {

    @Override
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    private boolean isValidBST(TreeNode root, Integer max, Integer min) {
        if (null == root) {
            return true;
        }
        if (null != max && root.val >= max) {
            return false;
        }

        if (null != min && root.val <= min) {
            return false;
        }

        boolean left = isValidBST(root.left, root.val, min);
        boolean right = isValidBST(root.right, max, root.val);
        return left && right;
    }
}
