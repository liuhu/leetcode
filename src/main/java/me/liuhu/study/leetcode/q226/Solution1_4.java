package me.liuhu.study.leetcode.q226;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/10
 **/
public class Solution1_4 implements Solution {

    @Override
    public TreeNode invertTree(TreeNode root) {
        if (null == root) {
            return null;
        }
        TreeNode tmp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(tmp);
        return root;
    }

}
