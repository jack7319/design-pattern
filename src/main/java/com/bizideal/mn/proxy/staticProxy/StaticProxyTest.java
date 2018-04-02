package com.bizideal.mn.proxy.staticProxy;

/**
 * @author : liulq
 * @date: 创建时间: 2018/4/2 13:45
 * @version: 1.0
 * @Description:
 */
public class StaticProxyTest {

    public static void main(String[] args) {
        UserInfoService userInfoService = new UserInfoServiceImpl();
        UserInfoServiceProxy userInfoServiceProxy = new UserInfoServiceProxy(userInfoService);
        userInfoServiceProxy.say();
    }
}
