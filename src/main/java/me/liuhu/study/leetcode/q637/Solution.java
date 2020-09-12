package me.liuhu.study.leetcode.q637;

import java.util.List;

/**
 * 637. 二叉树的层平均值
 * https://leetcode-cn.com/problems/average-of-levels-in-binary-tree/
 * 给定一个非空二叉树, 返回一个由每层节点平均值组成的数组。
 *
 * 输入：
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 输出：[3, 14.5, 11]
 * 解释：
 * 第 0 层的平均值是 3 ,  第1层是 14.5 , 第2层是 11 。因此返回 [3, 14.5, 11] 。
 *
 * @description:
 * @author: LiuHu
 * @create: 2020/9/12
 **/
public interface Solution {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    List<Double> averageOfLevels(TreeNode root);
}
