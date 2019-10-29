package me.liuhu.study.algorithm.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @description:
 * @author: LiuHu
 * @create: 2019/10/28
 **/
public class ArrayTest {

    /** 回文数组测试**/
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

    /** 回文 JDK linked list 测试 **/
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

    @Test
    public void testLinkedList() {
        ArrayDemo.MyLinkedList<String> linkedList = new ArrayDemo.MyLinkedList<>();
        // 检查链表大小
        Assert.assertEquals(0, linkedList.size());
        // 检查首个节点内容
        Assert.assertEquals(null, linkedList.getFirst());
        // 检查首个节点内容
        Assert.assertEquals(null, linkedList.getFirstNode());

        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");

        // 检查链表大小
        Assert.assertEquals(3, linkedList.size());
        // 检查首个节点内容
        Assert.assertEquals("1", linkedList.getFirst());
        // 检查首个节点内容
        Assert.assertEquals("1", linkedList.getFirstNode().getData());

        ArrayDemo.Node<String> node = linkedList.getFirstNode();
        for (int i = 0; i < linkedList.size(); i++) {
            Assert.assertEquals(i + 1 + "", node.getData());
            node = node.getNext();
        }
    }
}
