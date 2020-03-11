package me.liuhu.study.pattern.p50;

import lombok.extern.slf4j.Slf4j;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/3/10
 **/
@Slf4j
public class BaseCake extends AbstractCake {

    @Override
    String getDesc() {
        return "普通蛋糕";
    }

    @Override
    int getCost() {
        return 10;
    }
}
