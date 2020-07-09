package me.liuhu.study.leetcode.q145;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/9
 **/
public class Solution2_4 implements Solution {
    @Override
    public List<Integer> postorderTraversal(TreeNode root) {

        LinkedList<Integer> result = new LinkedList<>();
        if (null == root) {
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            result.addFirst(node.val);

            if (null != node.left) {
                stack.push(node.left);
            }

            if (null != node.right) {
                stack.push(node.right);
            }
        }

        return result;
    }
}
