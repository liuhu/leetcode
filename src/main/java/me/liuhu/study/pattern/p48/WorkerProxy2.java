package me.liuhu.study.pattern.p48;

import lombok.extern.slf4j.Slf4j;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/2/26
 **/
@Slf4j
public class WorkerProxy2 extends Worker {

    @Override
    public void process() {
        long startTime = System.currentTimeMillis();
        super.process();
        long endTime = System.currentTimeMillis();
        log.info("执行时间为: {} ms", endTime - startTime);
    }
}
