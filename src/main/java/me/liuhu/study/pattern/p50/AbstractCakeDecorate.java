package me.liuhu.study.pattern.p50;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/3/11
 **/
public abstract class AbstractCakeDecorate extends AbstractCake {
    protected AbstractCake abstractCake;

    public AbstractCakeDecorate(AbstractCake abstractCake) {
        this.abstractCake = abstractCake;
    }
}
