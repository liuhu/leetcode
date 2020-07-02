package me.liuhu.study.leetcode.q94;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/2
 **/
public class Solution2_2 implements Solution {

    @Override
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        TreeNode currentRoot = root;
        Stack<TreeNode> stack = new Stack<>();

        while (null != currentRoot || !stack.isEmpty()) {
            while (null != currentRoot) {
                stack.push(currentRoot);
                currentRoot = currentRoot.left;
            }
            currentRoot = stack.pop();
            result.add(currentRoot.val);
            currentRoot = currentRoot.right;
        }

        return result;
    }
}
