package me.liuhu.study.pattern.p49.t3;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/3/9
 **/
public abstract class AbstractBank {
    protected IAccount account;

    public AbstractBank(IAccount account) {
        this.account = account;
    }

    abstract IAccount openAccount();
}
