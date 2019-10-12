package me.liuhu.study.effective.java.generic;

import java.util.*;

/**
 * @description:
 * @author: LiuHu
 * @create: 2019-02-13 16:55
 **/
public class Stack<E> {
    private E[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    public Stack() {
        elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
    }
    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }
    public E pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        E result = elements[--size];
        elements[size] = null; // Eliminate obsolete reference
        return result;
    }

    /**
     * 如果它表示一个 T 消费者，就是用 <? super T>
     * @param dst
     */
    public void popAll2(Collection<? super E> dst) {
        while (!isEmpty())
            dst.add(pop());
    }

    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Ensure space for at least one more element, roughly
     * doubling the capacity each time the array needs to grow.
     */
    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

    public static void main(String[] args) {
        Stack<Number> numberStack = new Stack<Number>();
        Iterable<Integer> integers = Arrays.asList(1,2);
        //numberStack.pushAll(integers);
        numberStack.pushAll2(integers);

        //
        List<Object> integer2 = new ArrayList<>();
        numberStack.popAll2(integer2);
    }

    public void pushAll(Iterable<E> src) {
        for (E e : src) {
            push(e);
        }
    }

    /**
     * 如果参数化类型表示一个 T 生产者，就是用 <? extends T> ；
     * @param src
     */
    public void pushAll2(Iterable<? extends E> src) {
        for (E e : src) {
            push(e);
        }
    }
}
