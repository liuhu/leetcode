package me.liuhu.study.leetcode.q144;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/6
 **/
public class Solution2_5 implements Solution {


    @Override
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> res = new ArrayList<>();
        if (null == root) {
            return res;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode t = stack.pop();
            res.add(t.val);
            if (null != t.right) {
                stack.push(t.right);
            }
            if (null != t.left) {
                stack.push(t.left);
            }
        }

        return res;
    }
}
