package me.liuhu.study.leetcode.q226;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/11
 **/
public class Solution2_4 implements Solution {

    @Override
    public TreeNode invertTree(TreeNode root) {
        if (null == root) {
            return null;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;

            if (null != node.right) {
                queue.add(node.right);
            }

            if (null != node.left) {
                queue.add(node.left);
            }
        }

        return root;
    }
}
