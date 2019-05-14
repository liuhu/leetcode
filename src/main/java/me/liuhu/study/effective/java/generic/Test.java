package me.liuhu.study.effective.java.generic;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @description:
 * @author: LiuHu
 * @create: 2019-02-13 16:40
 **/
public class Test {

    public static <T extends Comparable<T>> T max(List<T> list) {
        Iterator<T> i = list.iterator();
        T result = i.next();
        while (i.hasNext()) {
            T t = i.next();
            if (t.compareTo(result) > 0)
                result = t;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(max(Arrays.asList("1","2")));

    }


}
