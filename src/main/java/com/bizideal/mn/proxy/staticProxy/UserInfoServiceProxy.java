package com.bizideal.mn.proxy.staticProxy;

/**
 * @author : liulq
 * @date: 创建时间: 2018/4/2 13:45
 * @version: 1.0
 * @Description:
 */
public class UserInfoServiceProxy {

    private UserInfoService userInfoService;

    public UserInfoServiceProxy(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }

    public void say() {
        System.out.println("before...");
        userInfoService.say();
        System.out.println("after...");
    }
}
