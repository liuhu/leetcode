package me.liuhu.study.effective.java.string;

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

        // str1 为常量池中对象地址， str2 为堆中对象地址,但实际会引用char[]数组， str3 常量池中对象地址
        System.out.println(checkEqual.apply(str1, str2));
        System.out.println(checkEqual.apply(str2, str3));
        System.out.println(checkEqual.apply(str1, str3));


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
}
