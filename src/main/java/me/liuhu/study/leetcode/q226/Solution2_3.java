package me.liuhu.study.leetcode.q226;


import java.util.Stack;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/7
 **/
public class Solution2_3 implements Solution {
    @Override
    public TreeNode invertTree(TreeNode root) {
        if (null == root) {
            return null;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode c = stack.pop();
            if (null != c.right) {
                stack.push(c.right);
            }

            if (null != c.left) {
                stack.push(c.left);
            }

            TreeNode tmp = c.left;
            c.left = c.right;
            c.right = tmp;
        }

        return root;
    }
}
