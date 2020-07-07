package me.liuhu.study.leetcode.q429;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/7
 **/
public class Solution1 implements Solution {


    @Override
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if (null == root) {
            return res;
        }
        helper(res, Collections.singletonList(root));
        return res;
    }

    public void helper(List<List<Integer>> res, List<Node> root) {
        if (null != root && !root.isEmpty()) {
            res.add(root.stream().map(x -> x.val).collect(Collectors.toList()));
            List<Node> rs = new ArrayList<>();
            for (Node d : root) {
                rs.addAll(d.children);
            }
            helper(res, rs);
        }
    }
}
