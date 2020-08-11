package me.liuhu.study.leetcode.q589;

import java.util.*;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/8/11
 **/
public class Solution2_4 implements Solution {
    @Override
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        if (null == root) {
            return res;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node c = stack.pop();
            res.add(c.val);
            if (null != c.children) {
                List<Node> nodes = c.children;
                Collections.reverse(nodes);
                for(Node _root : nodes) {
                    stack.push(_root);
                }
            }
        }
        return res;
    }
}
