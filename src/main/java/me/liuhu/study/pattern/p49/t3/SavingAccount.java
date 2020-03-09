package me.liuhu.study.pattern.p49.t3;

import lombok.extern.slf4j.Slf4j;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/3/9
 **/
@Slf4j
public class SavingAccount implements IAccount {
    @Override
    public IAccount createAccount() {
        log.info("创建一个活期银行");
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        log.info("这是一个活期银行");
    }
}
