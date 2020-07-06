package me.liuhu.study.leetcode.q589;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/6
 **/
public class Solution1_2 implements Solution {

    @Override
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        helper(res, root);
        return res;
    }

    public void helper(List<Integer> res, Node root) {
        if (null != root) {
            res.add(root.val);
            if(null != root.children) {
                for(Node _root : root.children) {
                    helper(res, _root);
                }
            }
        }
    }
}
