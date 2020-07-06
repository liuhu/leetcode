package me.liuhu.study.leetcode.q226;

import me.liuhu.study.effective.java.generic.Stack;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/6
 **/
public class Solution2_2 implements Solution {
    @Override
    public TreeNode invertTree(TreeNode root) {
        if (null == root) {
            return null;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode t = stack.pop();
            TreeNode tmp = t.left;
            t.left = t.right;
            t.right = tmp;

            if (null != t.right) {
                stack.push(t.right);
            }
            if (null != t.left) {
                stack.push(t.left);
            }

        }
        return root;
    }
}
