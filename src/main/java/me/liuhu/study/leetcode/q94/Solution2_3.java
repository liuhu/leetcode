package me.liuhu.study.leetcode.q94;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/1
 **/
@Slf4j
public class Solution2_3 implements Solution {

    @Override
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode curr = root;

        while (null != curr || !stack.isEmpty()) {

            // 找到最左边的节点
            while (null != curr) {
                stack.push(curr);
                curr = curr.left;
            }
            TreeNode t = stack.pop();
            res.add(t.val);
            curr = t.right;
        }

        return res;
    }
}
