package me.liuhu.study.leetcode.q145;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/12
 **/
public class SolutionTest {

    /**
     * 不可行，时间复杂度不符合要求 O{n*n*n}
     */
    @Test
    public void run1() {
        runTest(new Solution2());
    }

    @Test
    public void run2() {
        runTest(new Solution2_3());
    }



    private void runTest(Solution solution) {
        List<Integer> res = solution.postorderTraversal(getTree());
        List<Integer> expected = Arrays.asList(3,4,1,5,6,2,0);
        Assert.assertArrayEquals(expected.toArray(), res.toArray());
    }


    public Solution.TreeNode getTree() {
        Solution.TreeNode _3 = new Solution.TreeNode(3);
        Solution.TreeNode _4 = new Solution.TreeNode(4);
        Solution.TreeNode _1 = new Solution.TreeNode(1, _3, _4);

        Solution.TreeNode _5 = new Solution.TreeNode(5);
        Solution.TreeNode _6 = new Solution.TreeNode(6);
        Solution.TreeNode _2 = new Solution.TreeNode(2, _5, _6);

        Solution.TreeNode _0 = new Solution.TreeNode(0, _1, _2);

        return _0;
    }
}
