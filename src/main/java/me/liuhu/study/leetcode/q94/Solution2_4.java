package me.liuhu.study.leetcode.q94;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/7
 **/
public class Solution2_4 implements Solution {
    @Override
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode current = root;

        while (null != current || !stack.isEmpty()) {
            while (null != current) {
                stack.push(current);
                current = current.left;
            }
            TreeNode c = stack.pop();
            res.add(c.val);
            current = c.right;
        }

        return res;
    }
}
