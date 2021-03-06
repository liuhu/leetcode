package me.liuhu.study.leetcode.q111;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/18
 **/
public class Solution2_2 implements Solution {


    @Override
    public int minDepth(TreeNode root) {
        if (null == root) {
            return 0;
        }

        int depth = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size ; i++) {
                TreeNode node = queue.poll();
                if (null == node.left && null == node.right) {
                    return depth;
                }
                if (null != node.left) {
                    queue.add(node.left);
                }
                if (null != node.right) {
                    queue.add(node.right);
                }
            }
            depth ++;
        }

        return 0;
    }
}
