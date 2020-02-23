package me.liuhu.study.pattern.p44.factory;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/2/23
 **/
public class XmlOrderConfigParse implements IOrderConfigParser {
    @Override
    public OrderConfig parse(String filePath) {
        return new OrderConfig();
    }
}
