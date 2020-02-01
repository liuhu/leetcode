package me.liuhu.study.pattern.p34;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/2/1
 **/
public class IdGenerationFailureException extends Exception {
    public IdGenerationFailureException() {

    }
    public IdGenerationFailureException(String message) {
        super(message);
    }
}
