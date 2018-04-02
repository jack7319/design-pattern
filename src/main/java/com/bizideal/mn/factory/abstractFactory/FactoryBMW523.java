package com.bizideal.mn.factory.abstractFactory;

/**
 * @author : liulq
 * @date: 创建时间: 2018/4/2 10:38
 * @version: 1.0
 * @Description:
 */
public class FactoryBMW523 implements Factory {

    public Engine createEngine() {
        return new EngineB();
    }

    public Aircondition createAirCondition() {
        return new AirConditionB();
    }
}
