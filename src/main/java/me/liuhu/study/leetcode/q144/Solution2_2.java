package me.liuhu.study.leetcode.q144;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/1
 **/
public class Solution2_2 implements Solution {

    @Override
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> pre = new LinkedList<>();
        if (root == null) {
            return pre;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode nextRoot = stack.pop();
            pre.add(nextRoot.val);

            if (null != nextRoot.right) {
                stack.push(nextRoot.right);
            }

            if (null != nextRoot.left) {
                stack.push(nextRoot.left);
            }
        }

        return pre;
    }
}
