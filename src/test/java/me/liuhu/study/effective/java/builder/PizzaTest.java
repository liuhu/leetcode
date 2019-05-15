package me.liuhu.study.effective.java.builder;

import org.junit.Test;

/**
 * @description:
 * @author: LiuHu
 * @create: 2019-01-22 21:19
 **/
public class PizzaTest {

    @Test
    public void createPizza() {
        SizePizza aa = (SizePizza)new SizePizza.Builder(SizePizza.Size.SMALL).addTopping(Pizza.Topping.ONION).build();
        System.out.println(aa);
    }
}
