package me.liuhu.study.leetcode.q144;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/1
 **/
public class Solution2 implements Solution {

    @Override
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();

        if (root == null) {
            return list;
        }
        stack.push(root);

        //是先压右孩子再压左孩子，因为出栈就会是先左后右
        while(!stack.isEmpty()){
            //此处的root只是一个变量的复用
            root = stack.pop();
            list.add(root.val);

            if (root.right != null) {
                stack.push(root.right);
            }

            if(root.left != null) {
                stack.push(root.left);
            }
        }
        return list;
    }

}
