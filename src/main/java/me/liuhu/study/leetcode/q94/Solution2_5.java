package me.liuhu.study.leetcode.q94;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/16
 **/
public class Solution2_5 implements Solution {
    @Override
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (null == root) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (null != node || !stack.isEmpty()) {
            while (null != node) {
                stack.push(node);
                node = node.left;
            }
            TreeNode s = stack.pop();
            result.add(s.val);
            node = s.right;
        }

        return result;
    }
}
