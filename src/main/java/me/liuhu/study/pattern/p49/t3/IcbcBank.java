package me.liuhu.study.pattern.p49.t3;

import lombok.extern.slf4j.Slf4j;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/3/9
 **/
@Slf4j
public class IcbcBank extends AbstractBank {
    public IcbcBank(IAccount account) {
        super(account);
    }

    @Override
    IAccount openAccount() {
        log.info("打开工商银行账户");
        return account.createAccount();
    }
}
