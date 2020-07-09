package me.liuhu.study.leetcode.q144;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/9
 **/
public class Solution2_6 implements Solution {
    @Override
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (null == root) {
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            result.add(node.val);

            if (null != node.right) {
                stack.push(node.right);
            }

            if (null != node.left) {
                stack.push(node.left);
            }
        }

        return result;
    }
}
