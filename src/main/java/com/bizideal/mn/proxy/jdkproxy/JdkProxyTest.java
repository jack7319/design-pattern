package com.bizideal.mn.proxy.jdkproxy;

import java.lang.reflect.Proxy;

/**
 * @author : liulq
 * @date: 创建时间: 2018/4/2 13:55
 * @version: 1.0
 * @Description:
 */
public class JdkProxyTest {

    public static void main(String[] args) {
        UserInfoService userInfoService = new UserInfoServiceImpl();
        UserInfoInvocationHandler infoInvocationHandler = new UserInfoInvocationHandler(userInfoService);

        UserInfoService o = (UserInfoService) Proxy.newProxyInstance(JdkProxyTest.class.getClassLoader(), UserInfoServiceImpl.class.getInterfaces(), infoInvocationHandler);

        o.say();

    }
}
