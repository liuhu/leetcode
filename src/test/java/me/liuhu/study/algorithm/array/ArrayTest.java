package me.liuhu.study.algorithm.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @description:
 * @author: LiuHu
 * @create: 2019/10/28
 **/
public class ArrayTest {

    @Test
    public void testIsLoopbackText_True() {
        Assert.assertTrue(ArrayDemo.isLoopbackText("1"));
        Assert.assertTrue(ArrayDemo.isLoopbackText("12321"));
        Assert.assertTrue(ArrayDemo.isLoopbackText("123321"));
    }

    @Test
    public void testIsLoopbackText_False() {
        Assert.assertFalse(ArrayDemo.isLoopbackText("123"));
    }

    @Test
    public void isLoopbackTextByLinkedList_True() {
        Assert.assertTrue(ArrayDemo.isLoopbackTextByLinkedList("1"));
        Assert.assertTrue(ArrayDemo.isLoopbackTextByLinkedList("12321"));
        Assert.assertTrue(ArrayDemo.isLoopbackTextByLinkedList("123321"));
    }

    @Test
    public void isLoopbackTextByLinkedList_False() {
        Assert.assertFalse(ArrayDemo.isLoopbackTextByLinkedList("123"));
    }
}
