package me.liuhu.study.pattern.p41;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/2/22
 **/
public class ReflectHackSingleton {

    /**
     * 运用发射攻击单例模式
     * @param args
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws InstantiationException
     */
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        SingletonLazy instance = SingletonLazy.getInstance();

        Class<SingletonLazy> singletonLazyClazz = SingletonLazy.class;
        Constructor<SingletonLazy> constructor = singletonLazyClazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonLazy newInstance = constructor.newInstance();

        System.out.println(instance);
        System.out.println(newInstance);
    }
}
