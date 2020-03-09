package me.liuhu.study.pattern.p49.t2;

import lombok.extern.slf4j.Slf4j;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/3/9
 **/
@Slf4j
public class CreditAccount implements IAccount {

    private int balance;

    public CreditAccount(int balance) {
        this.balance = balance;
    }

    @Override
    public int getBalance() {
        log.info("信用账户信用额度为 {}", balance);
        return balance;
    }
}
