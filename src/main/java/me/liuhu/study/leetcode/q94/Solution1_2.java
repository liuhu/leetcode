package me.liuhu.study.leetcode.q94;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/2
 **/
public class Solution1_2 implements Solution {

    @Override
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderTraversal(result, root);
        return result;
    }

    public void inorderTraversal(List<Integer> result, TreeNode root) {
        if (null == root) {
            return;
        }

        if (null != root.left) {
            inorderTraversal(result, root.left);
        }

        result.add(root.val);

        if (null != root.right) {
            inorderTraversal(result, root.right);
        }
    }
}
