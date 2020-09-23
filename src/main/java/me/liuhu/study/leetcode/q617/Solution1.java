package me.liuhu.study.leetcode.q617;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/9/23
 **/
public class Solution1 implements Solution {
    @Override
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (null == t1) {
            return t2;
        }
        if (null == t2) {
            return t1;
        }

        TreeNode merged = new TreeNode(t1.val + t2.val);
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();

        queue.add(merged);
        q1.add(t1);
        q2.add(t2);

        while (!q1.isEmpty() && !q2.isEmpty()) {
            TreeNode node = queue.poll();
            TreeNode node1 = q1.poll();
            TreeNode node2 = q2.poll();

            TreeNode left1 = node1.left;
            TreeNode right1 = node1.right;

            TreeNode left2 = node2.left;
            TreeNode right2 = node2.right;

            if (left1 != null || left2 != null) {
                if (left1 != null && left2 != null) {
                    TreeNode left = new TreeNode(left1.val + left2.val);
                    node.left = left;
                    queue.add(left);
                    q1.add(left1);
                    q2.add(left2);
                } else if (left1 != null) {
                    node.left = left1;
                } else if (left2 != null) {
                    node.left = left2;
                }
            }
            if (right1 != null || right2 != null) {
                if (right1 != null && right2 != null) {
                    TreeNode right = new TreeNode(right1.val + right2.val);
                    node.right = right;
                    queue.add(right);
                    q1.add(right1);
                    q2.add(right2);
                } else if (right1 != null) {
                    node.right = right1;
                } else {
                    node.right = right2;
                }
            }
        }
        return merged;
    }
}
