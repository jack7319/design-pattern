package com.bizideal.mn.factory.abstractFactory;

/**
 * @author : liulq
 * @date: 创建时间: 2018/4/2 10:37
 * @version: 1.0
 * @Description:
 */
public interface Factory {

    Engine createEngine();

    Aircondition createAirCondition();
}
