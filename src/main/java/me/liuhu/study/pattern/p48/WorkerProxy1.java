package me.liuhu.study.pattern.p48;

import lombok.extern.slf4j.Slf4j;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/2/26
 **/
@Slf4j
public class WorkerProxy1 implements IWorker {

    private IWorker worker;

    public WorkerProxy1(IWorker worker) {
        this.worker = worker;
    }

    @Override
    public void process() {
        long startTime = System.currentTimeMillis();
        worker.process();
        long endTime = System.currentTimeMillis();
        log.info("执行时间为: {} ms", endTime - startTime);
    }
}
