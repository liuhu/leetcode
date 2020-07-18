package me.liuhu.study.algorithm.dfs;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/18
 **/
public class Solution1 implements Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (null == root) {
            return result;
        }
        dfs(result, root, 0);
        return result;
    }

    private void dfs(List<List<Integer>> result, TreeNode root, int level) {
        if (result.size() <= level) {
            result.add(new ArrayList<>());
        }
        result.get(level).add(root.val);
        if (null != root.left) {
            dfs(result, root.left, level + 1);
        }
        if (null != root.right) {
            dfs(result, root.right, level + 1);
        }
    }
}
