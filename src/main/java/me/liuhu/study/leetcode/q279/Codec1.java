package me.liuhu.study.leetcode.q279;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/8
 **/
public class Codec1 implements Codec {

    private static final TreeNode holder = new TreeNode(-1);
    @Override
    public String serialize(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (null == root) {
            return null;
        }
        serialize(res, Collections.singletonList(root));
        return res.toString();
    }


    public void serialize(List<Integer> res, List<TreeNode> nodes) {
        if (nodes.stream().filter(x -> x == holder).count() == nodes.size()) {
            return;
        }

        List<TreeNode> next = new ArrayList<>();
        for(TreeNode node : nodes) {
            if (node == holder) {
                res.add(null);
            } else {
                res.add(node.val);
                if (null == node.left) {
                    next.add(holder);
                } else {
                    next.add(node.left);
                }
                if (null == node.right) {
                    next.add(holder);
                } else {
                    next.add(node.right);
                }
            }
        }
        serialize(res, next);
    }

    @Override
    public TreeNode deserialize(String data) {
        if (null == data) {
            return null;
        }
        List<Integer> dataList = format(data);
        if (dataList.isEmpty()) {
            return null;
        }
        TreeNode head = new TreeNode(dataList.get(0));
        deserialize(Collections.singletonList(head), dataList, 1);
        return head;
    }

    private void deserialize(List<TreeNode> nodes, List<Integer> data, int index) {
        if (index >= data.size()) {
            return;
        }
        List<TreeNode> next = new ArrayList<>();
        for (TreeNode c : nodes) {
            Integer left = data.get(index++);
            Integer right = data.get(index++);
            if (null != left) {
                c.left = new TreeNode(left);
                next.add(c.left);
            }
            if (null != right) {
                c.right = new TreeNode(right);
                next.add(c.right);
            }
        }
        deserialize(next, data, index);
    }

    private List<Integer> format(String data) {
        List<Integer> dataList = new ArrayList<>();
        String format = data.replace("[","").replace("]","");
        if ("".equals(format)) {
            return dataList;
        }
        String[] dataArray =  format.split(",");
        for (String str : dataArray) {
            if ("null".equals(str.trim())) {
                dataList.add(null);
            } else {
                dataList.add(Integer.valueOf(str.trim()));
            }
        }
        return dataList;
    }

    public static void main(String[] args) {
        Codec1 codec1 = new Codec1();
        TreeNode node = codec1.deserialize("[");
        System.out.println(node);

        String aa = codec1.serialize(node);
        System.out.println(aa);
    }
}
