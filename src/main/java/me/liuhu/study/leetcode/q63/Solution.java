package me.liuhu.study.leetcode.q63;

/**
 * 63. 不同路径 II
 * https://leetcode-cn.com/problems/unique-paths-ii/
 *
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 * 现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？
 *
 * @description:
 * @author: LiuHu
 * @create: 2020/8/4
 **/
public interface Solution {
    int uniquePathsWithObstacles(int[][] obstacleGrid);
}
