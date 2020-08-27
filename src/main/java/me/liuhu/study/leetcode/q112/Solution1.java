package me.liuhu.study.leetcode.q112;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/8/26
 **/
public class Solution1 implements Solution {
    @Override
    public boolean hasPathSum(TreeNode root, int sum) {
        if (null == root) {
            return false;
        }
        if (null != root.right && null != root.left) {
            return true;
        }
        return hasPathSum(root.right, sum - root.val) || hasPathSum(root.left, sum - root.val);
    }



    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        TreeNode treeNode = new TreeNode(1);
        solution1.hasPathSum(treeNode, 0);
    }
}
