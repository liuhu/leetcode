package me.liuhu.study.leetcode.q429;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/8
 **/
public class Solution1_2 implements Solution {
    @Override
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if (null == root) {
            return res;
        }
        helper(res, Collections.singletonList(root));
        return res;
    }

    public void helper(List<List<Integer>> res, List<Node> nodes) {
        if (!nodes.isEmpty()) {
            res.add(nodes.stream().map(x -> x.val).collect(Collectors.toList()));
            List<Node> allChildren = nodes.stream().filter(x -> null != x.children)
                    .map(x -> x.children).flatMap(x -> x.stream()).collect(Collectors.toList());
            helper(res, allChildren);
        }
    }
}
