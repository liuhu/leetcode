package me.liuhu.study.pattern.p49.t1;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/3/9
 **/
public interface IMessageSender {
    /**
     * 发送消息
     * @param message
     */
    void send(String message);
}
