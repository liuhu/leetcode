package me.liuhu.study.leetcode.q589;

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


    @Test
    public void run1() {
        runTest(new Solution1());
    }


    @Test
    public void run2() {
        runTest(new Solution2());
    }

    private void runTest(Solution solution) {
        List<Integer> res = solution.preorder(getTree());
        List<Integer> expected = Arrays.asList(1, 3, 5, 6, 2, 4);
        Assert.assertArrayEquals(expected.toArray(), res.toArray());
    }

    private Solution.Node getTree() {
        Solution.Node _2 = new Solution.Node(2);
        Solution.Node _4 = new Solution.Node(4);

        Solution.Node _5 = new Solution.Node(5);
        Solution.Node _6 = new Solution.Node(6);
        Solution.Node _3 = new Solution.Node(3, Arrays.asList(_5, _6));

        Solution.Node _1 = new Solution.Node(1, Arrays.asList(_3, _2, _4));

        return _1;
    }
}
