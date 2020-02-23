package me.liuhu.study.pattern.p44.factory;

import java.io.File;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/2/23
 **/
public class OrderConfigLoader {

    public static void main(String[] args) {

        String configFile = "config.xml";
        IOrderConfigParseFactory configParseFactory = OrderConfigParseFactory.getFactory(getSuffix(configFile));
        IOrderConfigParser configParser = configParseFactory.createParser();
        OrderConfig orderConfig = configParser.parse(configFile);
    }

    /**
     * 根据文件路径，获取文件后缀
     * @param filePath
     * @return
     */
    private static String getSuffix(String filePath) {
        File file = new File(filePath);
        String fileName = file.getName();
        return fileName.substring(fileName.lastIndexOf(".") + 1);
    }
}
