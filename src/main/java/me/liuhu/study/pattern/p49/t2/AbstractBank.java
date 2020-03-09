package me.liuhu.study.pattern.p49.t2;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/3/9
 **/
public abstract class AbstractBank {
    protected IAccount iAccount;

    public AbstractBank(IAccount iAccount) {
        this.iAccount = iAccount;
    }

    abstract void showBalance();
}
