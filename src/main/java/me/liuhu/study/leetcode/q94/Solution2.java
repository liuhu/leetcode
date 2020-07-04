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
public class Solution2 implements Solution {

    @Override
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (null == root) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            log.info("S find left ---------");
            while (curr != null) {
                stack.push(curr);
                log.info("stack: {}", stack.toString() );
                curr = curr.left;
            }
            log.info("E find left ---------");
            log.info("");


            curr = stack.pop();
            log.info("stack: {}", stack.toString() );
            result.add(curr.val);
            curr = curr.right;
        }
        return result;
    }
}
