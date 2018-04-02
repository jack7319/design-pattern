package com.bizideal.mn.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author : liulq
 * @date: 创建时间: 2018/4/2 13:47
 * @version: 1.0
 * @Description:
 */
public class UserInfoInvocationHandler implements InvocationHandler {

    private UserInfoService userInfoService;

    public UserInfoInvocationHandler(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before..");
        Object invoke = method.invoke(userInfoService, args);
        System.out.println("after...");
        return invoke;
    }
}
