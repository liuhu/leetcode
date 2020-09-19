package me.liuhu.study.leetcode.q404;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/9/19
 **/
public class Solution1 implements Solution {

    @Override
    public int sumOfLeftLeaves(TreeNode root) {
        if (null == root) {
            return 0;
        }

        int sum = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (null != node.left && null == node.left.right && null == node.left.left) {
                    sum = sum + node.left.val;
                }
                if (null != node.left) {
                    queue.add(node.left);
                }
                if (null != node.right) {
                    queue.add(node.right);
                }
            }

        }
        return sum;
    }
}
