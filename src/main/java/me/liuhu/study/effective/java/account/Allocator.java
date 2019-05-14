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
public class Allocator {
    private  List<Account> als = new ArrayList<>();
    // 一次性申请所有资源
    synchronized boolean apply(
            Account from, Account to){
        // 保证申请的资源中只有一个线程在对账户操作
        if(als.contains(from) ||
                als.contains(to)){
            log.info("als = {}", als.stream().map(Account::getName).collect(Collectors.toList()));
            return false;
        } else {
            als.add(from);
            als.add(to);
        }
        return true;
    }
    // 归还资源
    synchronized void free(
            Account from, Account to){
        als.remove(from);
        als.remove(to);
    }
}
