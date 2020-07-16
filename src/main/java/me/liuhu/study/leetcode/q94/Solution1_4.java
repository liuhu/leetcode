package me.liuhu.study.leetcode.q94;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/16
 **/
public class Solution1_4 implements Solution {


    @Override
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (null == root) {
            return result;
        }
        helper(result, root);
        return result;
    }

    private void helper(List<Integer> result, TreeNode root) {
        if (null == root) {
            return;
        }
        helper(result, root.left);
        result.add(root.val);
        helper(result, root.right);
    }
}
