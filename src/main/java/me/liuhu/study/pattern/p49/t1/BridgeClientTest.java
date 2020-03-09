package me.liuhu.study.pattern.p49.t1;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/3/9
 **/
public class BridgeClientTest {

    public static void main(String[] args) {
        IMessageSender messageSender = new EmailMessageSender("abc@test.com", "Hello");
        Notification notification = new RuleExpiredNotification(messageSender);
        notification.notify("Hi ......");
    }
}
