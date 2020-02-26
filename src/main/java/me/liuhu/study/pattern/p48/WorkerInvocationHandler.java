package me.liuhu.study.pattern.p48;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/2/26
 **/
@Slf4j
public class WorkerInvocationHandler implements InvocationHandler {
    //被委托类对象;
    private Object obj;

    public WorkerInvocationHandler(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object result = method.invoke(obj, args);
        long endTime = System.currentTimeMillis();
        log.info("执行时间为: {} ms", endTime - startTime);
        return result;
    }
}
