package me.liuhu.study.leetcode.q589;

import java.util.List;

/**
 * 589. N叉树的前序遍历
 * https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/
 *
 * @description:
 * @author: LiuHu
 * @create: 2020/7/1
 **/
public interface Solution {
    class Node {
        int val;
        public List<Node> children;

        Node() {
        }

        Node(int _val) {
            val = _val;
        }

        Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }

        @Override
        public String toString() {
            return String.valueOf(val);
        }
    }

    List<Integer> preorder(Node root);
}
