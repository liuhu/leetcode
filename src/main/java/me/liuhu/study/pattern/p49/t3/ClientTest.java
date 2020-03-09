package me.liuhu.study.pattern.p49.t3;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/3/9
 **/
public class ClientTest {

    public static void main(String[] args) {
        IAccount savingAccount = new SavingAccount();
        IAccount creditAccount = new CreditAccount();

        AbstractBank abcBank = new AbcBank(savingAccount);
        AbstractBank icbcBank = new IcbcBank(creditAccount);

        IAccount abcSavingAccount = abcBank.openAccount();
        abcSavingAccount.showAccountType();

        IAccount icbcCreditBank = icbcBank.openAccount();
        icbcCreditBank.showAccountType();
    }
}
