package me.liuhu.study.pattern.p49.t2;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/3/9
 **/
public class ClientTest {

    public static void main(String[] args) {

        IAccount iAccount = new SavingAccount(100);
        AbstractBank bank = new AbcBank(iAccount);
        bank.showBalance();

        IAccount iAccount2 = new CreditAccount(12);
        AbstractBank bank2 = new IcbcBank(iAccount2);
        bank2.showBalance();

    }
}
