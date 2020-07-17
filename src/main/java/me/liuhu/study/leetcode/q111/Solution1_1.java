package me.liuhu.study.leetcode.q111;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/17
 **/
public class Solution1_1 implements Solution {

    public int minDepth(Solution.TreeNode root) {
        if (null == root) {
            return 0;
        }

        if (null == root.right && null == root.left) {
            return 1;
        }

        if (null == root.right) {
            return minDepth(root.left) + 1;
        }

        if (null == root.left) {
            return minDepth(root.right) + 1;
        }

        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}
