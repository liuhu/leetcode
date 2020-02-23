package me.liuhu.study.pattern.p44.factory;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/2/23
 **/
public interface IOrderConfigParseFactory {
    /**
     * 创建解析器
     * @return
     */
    IOrderConfigParser createParser();
}
