package me.liuhu.study.pattern.p49.t1;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/3/9
 **/
public class RuleExpiredNotification extends Notification {

    public RuleExpiredNotification(IMessageSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        msgSender.send(message);
    }
}
