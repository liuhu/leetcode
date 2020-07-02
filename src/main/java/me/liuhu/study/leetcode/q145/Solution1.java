package me.liuhu.study.leetcode.q145;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/1
 **/
public class Solution1 implements Solution {

    @Override
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        postorderTraversal(res, root);
        return res;
    }

    public void postorderTraversal(List<Integer> res, TreeNode root) {
        if (null == root) {
            return;
        }
        postorderTraversal(res, root.left);
        postorderTraversal(res, root.right);
        res.add(root.val);
    }
}
