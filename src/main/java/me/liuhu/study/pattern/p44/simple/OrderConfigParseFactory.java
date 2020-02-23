package me.liuhu.study.pattern.p44.simple;

import java.util.HashMap;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/2/23
 **/
public class OrderConfigParseFactory {

    private static final HashMap<String, IOrderConfigParser> parseMap = new HashMap<>(10);
    static {
        parseMap.put("json", new JsonConfigParser());
        parseMap.put("xml", new XmlConfigParser());
    }

    public static IOrderConfigParser createParser(String suffix) {
        if (null == suffix) {
            return null;
        }
        return parseMap.get(suffix.toLowerCase());
    }
}
