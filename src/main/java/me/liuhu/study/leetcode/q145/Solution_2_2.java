package me.liuhu.study.leetcode.q145;

import java.util.*;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/4
 **/
public class Solution_2_2 implements Solution {


    @Override
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> res = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) {
            return res;
        }

        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            res.addFirst(node.val);
            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap(5, 0.75f, false);
        map.put("1", "1");
        map.put("3", "3");
        map.put("2", "2");
        map.put("5", "5");
        map.put("4", "4");

        map.get("1");

        System.out.println(map);

    }
}
