package me.liuhu.study.leetcode.q145;

import java.util.*;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/1
 **/
public class Solution2 implements Solution {

    @Override
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> output = new LinkedList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        if (root == null) {
            return output;
        }

        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pollLast();
            output.addFirst(node.val);
            if (node.left != null) {
                stack.add(node.left);
            }
            if (node.right != null) {
                stack.add(node.right);
            }
        }
        return output;
    }
}
