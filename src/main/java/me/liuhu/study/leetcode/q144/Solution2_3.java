package me.liuhu.study.leetcode.q144;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/4
 **/
public class Solution2_3 implements Solution {


    @Override
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode _root = stack.pop();
            res.add(_root.val);

            if (null != _root.right) {
                stack.push(_root.right);
            }

            if (null != _root.left) {
                stack.push(_root.left);
            }
        }

        return res;
    }
}
