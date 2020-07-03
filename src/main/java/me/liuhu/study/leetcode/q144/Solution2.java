package me.liuhu.study.leetcode.q144;

import java.util.*;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/1
 **/
public class Solution2 implements Solution {

    @Override
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (node != null || !stack.isEmpty()) {
            if (node != null) {
                result.add(node.val);
                stack.push(node.right);
                node = node.left;
            } else {
                node = stack.pop();
            }
        }
        return result;
    }

}
