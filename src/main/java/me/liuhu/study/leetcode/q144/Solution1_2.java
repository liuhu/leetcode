package me.liuhu.study.leetcode.q144;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/9
 **/
public class Solution1_2 implements Solution {

    @Override
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (null == root) {
            return result;
        }
        helper(result, root);
        return result;
    }

    public void helper(List<Integer> result, TreeNode root) {
        if (null == root) {
            return;
        }
        result.add(root.val);
        helper(result, root.left);
        helper(result, root.right);
    }
}
