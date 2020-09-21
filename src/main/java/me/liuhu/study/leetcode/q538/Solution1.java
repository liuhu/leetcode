package me.liuhu.study.leetcode.q538;

import java.util.Stack;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/9/21
 **/
public class Solution1 implements Solution {

    int sum = 0;

    @Override
    public TreeNode convertBST(TreeNode root) {
        if (null != root) {
            convertBST(root.right);
            sum = root.val + sum;
            root.val = sum;
            convertBST(root.left);
        }
        return root;
    }
}
