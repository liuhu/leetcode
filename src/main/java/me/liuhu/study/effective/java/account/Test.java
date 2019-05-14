package me.liuhu.study.effective.java.account;

import lombok.extern.slf4j.Slf4j;


/**
 * @description:
 * @author: LiuHu
 * @create: 2019-05-07 22:35
 **/
@Slf4j
public class Test {

    public static void main(String[] args) throws Exception {
        Allocator allocator = new Allocator();

        Account a = new Account(allocator, 123, "a");
        Account b = new Account(allocator, 456, "b");

        Account c = new Account(allocator, 789, "c");
        Account d = new Account(allocator, 123, "d");

        Account e = new Account(allocator, 789, "e");
        Account f = new Account(allocator, 123, "f");


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
