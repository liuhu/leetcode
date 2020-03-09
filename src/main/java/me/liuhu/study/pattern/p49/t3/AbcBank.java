package me.liuhu.study.pattern.p49.t3;

import lombok.extern.slf4j.Slf4j;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/3/9
 **/
@Slf4j
public class AbcBank extends AbstractBank {
    public AbcBank(IAccount account) {
        super(account);
    }

    @Override
    public IAccount openAccount() {
        log.info("打开农业银行账户");
        return account.createAccount();
    }
}
