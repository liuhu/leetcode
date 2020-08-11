package me.liuhu.study.leetcode.q589;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/8/11
 **/
public class Solution1_4 implements Solution {
    @Override
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        helper(res, root);
        return res;
    }

    private void helper(List<Integer> result, Node root) {
        if (null == root) {
            return;
        }
        result.add(root.val);
        for (Node node : root.children) {
            helper(result, node);
        }
    }
}
