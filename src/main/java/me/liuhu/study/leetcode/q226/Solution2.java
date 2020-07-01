package me.liuhu.study.leetcode.q226;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/1
 **/
public class Solution2 implements Solution {


    /**
     * 二叉树反转
     * @param root
     * @return
     */
    @Override
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        final Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root);

        while(!stack.isEmpty()) {
            final TreeNode node = stack.pop();
            final TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;

            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }
        return root;
    }
}
