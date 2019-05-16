package me.liuhu.study.effective.java.account;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: LiuHu
 * @create: 2019-05-07 22:51
 **/
@Slf4j
public class Allocator2 {
    private  List<Account2> als = new ArrayList<>();
    // 一次性申请所有资源
    synchronized void apply (
            Account2 from, Account2 to){
        // 保证申请的资源中只有一个线程在对账户操作
        if(als.contains(from) ||
                als.contains(to)){
            try {
                log.info("{} -> {}等待", from.getName(), to.getName());
                wait();
                log.info("als = {}", als.stream().map(Account2::getName).collect(Collectors.toList()));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } else {
            als.add(from);
            als.add(to);
        }
    }
    // 归还资源
    synchronized void free (
            Account2 from, Account2 to){
        als.remove(from);
        als.remove(to);
        log.info("{} -> {}通知", from.getName(), to.getName());
        notifyAll();
    }
}
