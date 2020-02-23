package me.liuhu.study.pattern.p44.simple;

import java.io.File;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/2/23
 **/
public class OrderConfigLoader {

    public static void main(String[] args) {
        String configFile = "/tmp/config.json";
        String suffix = getSuffix(configFile);
        IOrderConfigParser configParser = OrderConfigParseFactory.createParser(suffix);
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
