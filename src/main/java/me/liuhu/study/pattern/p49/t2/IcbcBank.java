package me.liuhu.study.pattern.p49.t2;

import lombok.extern.slf4j.Slf4j;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/3/9
 **/
@Slf4j
public class IcbcBank extends AbstractBank {

    public IcbcBank(IAccount iAccount) {
        super(iAccount);
    }

    @Override
    void showBalance() {
        int balance = iAccount.getBalance();
        log.info("工商银行的余额为 {}", balance);
    }
}
