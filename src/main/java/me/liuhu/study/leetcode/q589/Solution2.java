package me.liuhu.study.leetcode.q589;

import java.util.*;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/5
 **/
public class Solution2 implements Solution {


    @Override
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        if (null == root) {
            return res;
        }

        LinkedList<Node> stack = new LinkedList<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node _root = stack.pollLast();
            res.add(_root.val);

            if (null != _root.children) {
                Collections.reverse(_root.children);
                for (Node t : _root.children) {
                    stack.addLast(t);
                }
            }

        }

        return res;
    }
}
