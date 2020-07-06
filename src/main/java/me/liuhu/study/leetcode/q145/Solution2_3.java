package me.liuhu.study.leetcode.q145;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/6
 **/
public class Solution2_3 implements Solution {

    @Override
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> res = new LinkedList<>();
        if (null == root) {
            return res;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode t = stack.pop();
            res.addFirst(t.val);

            if (null != t.left) {
                stack.push(t.left);
            }

            if (null != t.right) {
                stack.push(t.right);
            }
        }

        return res;
    }
}
