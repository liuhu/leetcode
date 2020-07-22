package me.liuhu.study.leetcode.q515;

import java.util.*;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/22
 **/
public class Solution1 implements Solution {


    @Override
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (null == root) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((v1, v2) -> {
            if (v1 > v2) {
                return -1;
            } else if (v1 < v2) {
                return 1;
            } else {
                return 0;
            }
        });
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                priorityQueue.add(node.val);
                if (null != node.left) {
                    queue.add(node.left);
                }
                if (null != node.right) {
                    queue.add(node.right);
                }
            }
            result.add(priorityQueue.poll());
            priorityQueue.clear();
        }
        return result;
    }
}
