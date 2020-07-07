package me.liuhu.study.leetcode.q429;

import java.util.List;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/7
 **/
public interface Solution {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    List<List<Integer>> levelOrder(Node root);
}
