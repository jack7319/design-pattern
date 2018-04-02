package com.bizideal.mn.proxy.cglibProxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author : liulq
 * @date: 创建时间: 2018/4/2 13:59
 * @version: 1.0
 * @Description:
 */
public class UserInfoMethodInterceptor implements MethodInterceptor {

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before..");
        Object o1 = methodProxy.invokeSuper(o, objects);
        System.out.println("after...");
        return o1;
    }
}
