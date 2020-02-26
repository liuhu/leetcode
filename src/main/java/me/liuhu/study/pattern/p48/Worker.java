package me.liuhu.study.pattern.p48;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/2/26
 **/
@Slf4j
public class Worker implements IWorker {

    @SneakyThrows
    @Override
    public void process() {
        log.info("do work ... ");
        Thread.sleep(1000);
    }
}
