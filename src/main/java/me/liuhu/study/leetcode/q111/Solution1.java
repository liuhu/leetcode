package me.liuhu.study.leetcode.q111;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/17
 **/
public class Solution1 implements Solution {

    @Override
    public int minDepth(TreeNode root) {
        if (null == root) {
            return 0;
        }

        if (null == root.left && null == root.right) {
            return 1;
        }

        if (null == root.left) {
            return minDepth(root.right) + 1;
        }

        if (null == root.right) {
            return minDepth(root.left) + 1;
        }

        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}
