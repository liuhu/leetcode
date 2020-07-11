package me.liuhu.study.leetcode.q429;

import java.util.*;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/10
 **/
public class Solution2_1 implements Solution {
    @Override
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            List<Integer> val = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                val.add(node.val);
                queue.addAll(node.children);
            }
            result.add(val);
        }
        return result;
    }
}
