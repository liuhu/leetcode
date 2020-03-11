package me.liuhu.study.pattern.p50;

import lombok.extern.slf4j.Slf4j;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/3/10
 **/
@Slf4j
public class AddFruitCake extends AbstractCakeDecorate {

    public AddFruitCake(AbstractCake abstractCake) {
        super(abstractCake);
    }

    @Override
    String getDesc() {
        return abstractCake.getDesc() + " 加水果";
    }

    @Override
    int getCost() {
        return 2 + abstractCake.getCost();
    }
}
