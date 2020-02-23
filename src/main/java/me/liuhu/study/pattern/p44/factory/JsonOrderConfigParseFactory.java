package me.liuhu.study.pattern.p44.factory;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/2/23
 **/
public class JsonOrderConfigParseFactory implements IOrderConfigParseFactory {
    @Override
    public IOrderConfigParser createParser() {
        return new JsonOrderConfigParse();
    }
}
