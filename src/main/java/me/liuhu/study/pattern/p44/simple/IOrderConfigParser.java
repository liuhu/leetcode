package me.liuhu.study.pattern.p44.simple;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/2/23
 **/
public interface IOrderConfigParser {
    /**
     * 解析文件
     * @param filePath
     * @return
     */
    OrderConfig parse(String filePath);
}
