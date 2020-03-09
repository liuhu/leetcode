package me.liuhu.study.pattern.p49.t1;

import lombok.extern.slf4j.Slf4j;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/3/9
 **/
@Slf4j
public class EmailMessageSender implements IMessageSender {
    private String toAddr;
    private String title;

    public EmailMessageSender(String toAddr, String title) {
        this.toAddr = toAddr;
        this.title = title;
    }

    @Override
    public void send(String message) {
        log.info("Send message to {} by E-mail, title is {}, messages is {}", toAddr, title, message);
    }
}
