package com.bizideal.mn.proxy.cglibProxy;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author : liulq
 * @date: 创建时间: 2018/4/2 14:01
 * @version: 1.0
 * @Description:
 */
public class CglibProxyTest {

    public static void main(String[] args) {
        UserInfoMethodInterceptor userInfoMthodInterceptor = new UserInfoMethodInterceptor();

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserInfoServiceImpl.class);
        enhancer.setCallback(userInfoMthodInterceptor);

        UserInfoService o = (UserInfoService) enhancer.create();
        o.say();
    }
}
