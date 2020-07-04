package me.liuhu.study.leetcode.q144;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/4
 **/
public class Solution2_4 implements Solution {


    @Override
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;

        while (!stack.isEmpty() || null != node) {
            if (null != node) {
                res.add(node.val);
                stack.push(node.right);
                node = node.left;
            } else {
                node = stack.pop();
            }
        }

        return res;
    }
}
