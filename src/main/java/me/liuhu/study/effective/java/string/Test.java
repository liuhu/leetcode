package me.liuhu.study.effective.java.string;

import me.liuhu.study.effective.java.string.inner.Class3;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

/**
 * @description:
 * @author: LiuHu
 * @create: 2019/10/12
 **/
public class Test {

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc");
        String str3 = new String("abc").intern();

        BiFunction<String, String, Boolean> checkEqual = (s1, s2) -> s1 == s2;



        // str1 为常量池中对象地址， str2 为堆中对象地址,但实际会引用char[]数组
        System.out.println("1---- " + checkEqual.apply(str1, str2));
        //  str3 常量池中对象地址
        System.out.println("2---- " + checkEqual.apply(str2, str3));
        System.out.println("3---- " + checkEqual.apply(str1, str3));
        // 在同包不同类下
        System.out.println("4---- " + checkEqual.apply(str1, InnerClass.STR));
        // 在同包不同类下
        System.out.println("5---- " + checkEqual.apply(str1, Class2.STR));
        // 在不同包不同类下
        System.out.println("6---- " + str1 == Class3.STR);
        // 从静态方法中返回
        System.out.println("7---- " + str1 == Class3.getStr());

        boolean s = str1 == new Class3().getStr2();
        // 从普通方法中返回
        System.out.println("8---- " + s);

        // 4～7 的例子都是true，说明java8中 常量池是在堆中保存的，而不是在方法区



        Long a = 5L;
        Long b = 5L;
        // in cache
        System.out.println(a == b);

        Long c = 129L;
        Long d = 129L;
        // no in cache
        System.out.println(c == d);

        List<Long> nums = Arrays.asList(129L, 130L);
        System.out.println(getNum(nums) == nums.get(0));
    }

    private static Long getNum(List<Long> nums) {
        return nums.get(0);
    }

    public class InnerClass {
        public static final String STR = "abc";
    }
}
