package me.liuhu.study.leetcode.q589;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/6
 **/
public class Solution2_2 implements Solution {
    @Override
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();

        if (null == root) {
            return res;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node t = stack.pop();
            res.add(t.val);
            if (null != t.children) {
                Collections.reverse(t.children);
                stack.addAll(t.children);
            }
        }
        return res;
    }
}
