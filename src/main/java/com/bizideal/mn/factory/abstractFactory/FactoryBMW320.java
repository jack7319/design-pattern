package com.bizideal.mn.factory.abstractFactory;

/**
 * @author : liulq
 * @date: 创建时间: 2018/4/2 10:37
 * @version: 1.0
 * @Description:
 */
public class FactoryBMW320 implements Factory {

    public Engine createEngine() {
        return new EngineA();
    }

    public Aircondition createAirCondition() {
        return new AirConditionA();
    }
}
