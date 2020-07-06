package me.liuhu.study.leetcode.q49;

import java.util.List;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/30
 **/
public interface Solution {
    /**
     * 输入: ["eat", "tea", "tan", "ate", "nat", "bat"]
     * 输出:
     * [
     *   ["ate","eat","tea"],
     *   ["nat","tan"],
     *   ["bat"]
     * ]
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/group-anagrams
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param strs
     * @return
     */
    List<List<String>> groupAnagrams(String[] strs);
}
