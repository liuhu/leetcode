package me.liuhu.study.leetcode.q433;

import java.util.*;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/22
 **/
public class Solution1 implements Solution {

    Set<String> used = new HashSet<>();
    @Override
    public int minMutation(String start, String end, String[] bank) {
        int step = 0;
        Set<String> banks = new HashSet<>(Arrays.asList(bank));
        Queue<String> queue = new LinkedList<>();
        queue.add(start);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String str = queue.poll();
                List<String> nexts = findNext(str, banks);
                if (nexts.contains(end)) {
                    return step + 1;
                } else {
                    System.out.println(nexts);
                    queue.addAll(nexts);
                }
            }
            step++;
        }
        return -1;
    }


    private List<String> findNext(String start, Set<String> bank) {
        List<String> next = new ArrayList<>();
        for (int i = 0; i < start.length(); i++) {
            char[] bases = new char[]{'A','C','G','T'};
            for (char base : bases) {
                char[] chars = start.toCharArray();
                chars[i] = base;
                String tmp = new String(chars);
                if (bank.contains(tmp) && !used.contains(tmp)) {
                    next.add(tmp);
                    used.add(tmp);
                }
            }
        }
        return next;
    }

    public static void main(String[] args) {
        Solution solution = new Solution1();
        String start = "AAAAAAAA";
        String end = "CCCCCCCC";
        String[] bank = new String[]{"AAAAAAAA","AAAAAAAC","AAAAAACC","AAAAACCC","AAAACCCC","AACACCCC","ACCACCCC","ACCCCCCC","CCCCCCCA","CCCCCCCC"};
        System.out.println(solution.minMutation(start, end, bank));
    }
}
