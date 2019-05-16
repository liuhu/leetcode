package me.liuhu.study.effective.java.account;

import lombok.extern.slf4j.Slf4j;


/**
 * @description:
 * @author: LiuHu
 * @create: 2019-05-07 22:35
 **/
@Slf4j
public class Test2 {

    public static void main(String[] args) throws Exception {
        Allocator2 allocator2 = new Allocator2();

        Account2 a = new Account2(allocator2, 123, "a");
        Account2 b = new Account2(allocator2, 456, "b");

        Account2 c = new Account2(allocator2, 789, "c");
        Account2 d = new Account2(allocator2, 123, "d");

        Account2 e = new Account2(allocator2, 789, "e");
        Account2 f = new Account2(allocator2, 123, "f");


        Thread thread_ab = new Thread(() -> {
            a.transfer(b, 3);
        });

        Thread thread_cd = new Thread(() -> {
            c.transfer(d, 1);
        });

        Thread thread_ba = new Thread(() -> {
            b.transfer(a, 1);
        });

        Thread thread_ef = new Thread(() -> {
            e.transfer(f, 1);
        });



        thread_ab.start();
        thread_cd.start();
        thread_ef.start();
        thread_ba.start();

        Thread.sleep(6000);

    }
}
