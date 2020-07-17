package me.liuhu.study.leetcode.q104;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/16
 **/
public class Solution1_2 implements Solution {

    @Override
    public int maxDepth(TreeNode root) {
        if (null == root) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.right), maxDepth(root.left));
    }
}
