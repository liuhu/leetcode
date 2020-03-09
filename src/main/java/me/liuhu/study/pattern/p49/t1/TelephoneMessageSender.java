package me.liuhu.study.pattern.p49.t1;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/3/9
 **/
@Slf4j
public class TelephoneMessageSender implements IMessageSender {
    private List<String> telephones;

    public TelephoneMessageSender(List<String> telephones) {
        this.telephones = telephones;
    }

    @Override
    public void send(String message) {
        log.info("Send message to {} by phone, messages is {}", telephones, message);
    }
}
