package me.liuhu.study.leetcode.q279;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/8
 **/
public interface Codec {

    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    String serialize(TreeNode root);
    TreeNode deserialize(String data);
}
