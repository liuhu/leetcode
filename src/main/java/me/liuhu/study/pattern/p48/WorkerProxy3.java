package me.liuhu.study.pattern.p48;

import java.lang.reflect.Proxy;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/2/26
 **/
public class WorkerProxy3 {

    /**
     * 创建代理对象
     * @param worker 被代理对象
     * @return
     */
    public IWorker createProxy(IWorker worker) {
        return (IWorker) Proxy.newProxyInstance(
                worker.getClass().getClassLoader(),
                worker.getClass().getInterfaces(),
                new WorkerInvocationHandler(worker));
    }
}
