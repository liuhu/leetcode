package me.liuhu.study.pattern.p48;

import java.lang.reflect.Proxy;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/2/26
 **/
public class ProxyTestClient {

    public static void main(String[] args) {
        Worker worker1 = new Worker();
        IWorker workerProxy1 = new WorkerProxy1(worker1);
        workerProxy1.process();

        IWorker worker2 = new WorkerProxy2();
        worker2.process();

        WorkerProxy3 workerProxy3 = new WorkerProxy3(worker1);
        workerProxy3.createProxy().process();
    }
}
