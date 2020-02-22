package me.liuhu.study.pattern.p41;

import org.junit.Assert;
import org.junit.Test;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/2/22
 **/
public class SingletonTest {

    @Test
    public void testSingletonLazy() {
        Assert.assertEquals(0L, SingletonLazy.getInstance().getId());
    }

    @Test
    public void testSingletonHungry() {
        Assert.assertEquals(0L, SingletonHungry.getInstance().getId());
    }

    @Test
    public void testSingletonInnerClazz() {
        Assert.assertEquals(0L, SingletonInnerClazz.getInstance().getId());
    }

    @Test
    public void testSingletonDoubleCheck() {
        Assert.assertEquals(0L, SingletonDoubleCheck.getInstance().getId());
    }

    @Test
    public void testSingletonEnum() {
        Assert.assertEquals(0L, SingletonEnum.INSTANCE.getId());
    }
}
