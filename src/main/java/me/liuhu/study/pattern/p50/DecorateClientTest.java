package me.liuhu.study.pattern.p50;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/3/11
 **/
public class DecorateClientTest {

    public static void main(String[] args) {
        AbstractCake cake = new BaseCake();
        cake = new AddFruitCake(cake);
        cake = new AddChocolateCake(cake);
        System.out.println(cake.getDesc() + "  " + cake.getCost());
    }
}
