package me.liuhu.study.pattern.p49.t1;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/3/9
 **/
public abstract class Notification {

    protected IMessageSender msgSender;

    public Notification(IMessageSender msgSender) {
        this.msgSender = msgSender;
    }

    /**
     * 发送通知
     * @param message
     */
    public abstract void notify(String message);
}
