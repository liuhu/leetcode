package me.liuhu.study.pattern.p50;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/3/11
 **/
public class AddChocolateCake extends AbstractCakeDecorate {

    public AddChocolateCake(AbstractCake abstractCake) {
        super(abstractCake);
    }

    @Override
    String getDesc() {
        return  abstractCake.getDesc() + " 加巧克力 ";
    }

    @Override
    int getCost() {
        return abstractCake.getCost() + 66;
    }
}
