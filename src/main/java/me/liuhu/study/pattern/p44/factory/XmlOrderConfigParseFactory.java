package me.liuhu.study.pattern.p44.factory;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/2/23
 **/
public class XmlOrderConfigParseFactory implements IOrderConfigParseFactory {
    @Override
    public IOrderConfigParser createParser() {
        return new XmlOrderConfigParse();
    }
}
