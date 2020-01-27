package me.liuhu.study.pattern.p29;

import java.util.UUID;

public class IdGenerator {
    public static String generateTransactionId() {
        return UUID.randomUUID().toString();
    }
}