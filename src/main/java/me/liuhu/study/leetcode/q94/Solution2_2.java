package me.liuhu.study.leetcode.q94;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/2
 **/
public class Solution2_2 implements Solution {

    @Override
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        TreeNode currentRoot = root;
        Stack<TreeNode> stack = new Stack<>();

        while (null != currentRoot || !stack.isEmpty()) {
            // 不断往左子树方向走，每走一次就将当前节点保存到栈中
            // 直到左子树走到头
            while (null != currentRoot) {
                stack.push(currentRoot);
                currentRoot = currentRoot.left;
            }
            // 弹出
            currentRoot = stack.pop();
            // 打印节点
            result.add(currentRoot.val);
            // 转向右边节点，继续上面整个过程
            currentRoot = currentRoot.right;
        }

        return result;
    }
}
