package me.liuhu.study.pattern.p44.factory;

import me.liuhu.study.pattern.p44.simple.IOrderConfigParser;
import me.liuhu.study.pattern.p44.simple.JsonConfigParser;
import me.liuhu.study.pattern.p44.simple.XmlConfigParser;

import java.util.HashMap;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/2/23
 **/
public class OrderConfigParseFactory {

    private static final HashMap<String, IOrderConfigParseFactory> parseMap = new HashMap<>(10);
    static {
        parseMap.put("json", new JsonOrderConfigParseFactory());
        parseMap.put("xml", new XmlOrderConfigParseFactory());
    }

    public static IOrderConfigParseFactory getFactory(String suffix) {
        if (null == suffix) {
            return null;
        }
        return parseMap.get(suffix);
    }
}
