package me.liuhu.study.leetcode.q17;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 17. 电话号码的字母组合
 * https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/
 *
 * @description:
 * @author: LiuHu
 * @create: 2020/7/13
 **/
public class Solution1 implements Solution {
    private static Map<String, List<String>> keyMap = new HashMap<String, List<String>>(){{
        put("2", Arrays.asList("a", "b", "c"));
        put("3", Arrays.asList("d", "e", "f"));
        put("4", Arrays.asList("g", "h", "i"));
        put("5", Arrays.asList("j", "k", "l"));
        put("6", Arrays.asList("m", "n", "o"));
        put("7", Arrays.asList("p", "q", "r", "s"));
        put("8", Arrays.asList("t", "u", "v"));
        put("9", Arrays.asList("w", "x", "y", "z"));
    }};

    @Override
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (null == digits || digits.length() == 0) {
            return result;
        }
        List<List<String>> dl = new ArrayList<>();
        for(char c : digits.toCharArray()) {
            List<String> keyList = keyMap.get(String.valueOf(c));
            if (null != keyList) {
                dl.add(keyList);
            }
        }

        dfs(result, "", dl, 0, dl.size());

        return result;
    }


    private void dfs(List<String> result, String str, List<List<String>> dl, int level, int len) {
        if (str.length() == len) {
            result.add(str);
            return;
        }

        List<String> current = dl.get(level);
        for (String s : current) {
            str = str + s;
            dfs(result, str, dl, level + 1, len);
            // 回溯
            str = str.substring(0, str.length() - 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new  Solution1();
        List<String> result = solution.letterCombinations("22");
        System.out.println(result);
    }
}
