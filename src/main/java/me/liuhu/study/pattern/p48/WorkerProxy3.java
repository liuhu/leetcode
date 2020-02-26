package me.liuhu.study.pattern.p48;

import java.lang.reflect.Proxy;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/2/26
 **/
public class WorkerProxy3 {
    private Object object;

    public WorkerProxy3(Object object) {
        this.object = object;
    }

    public IWorker createProxy() {
        return (IWorker) Proxy.newProxyInstance(
                object.getClass().getClassLoader(),
                object.getClass().getInterfaces(),
                new WorkerInvocationHandler(object));
    }
}
