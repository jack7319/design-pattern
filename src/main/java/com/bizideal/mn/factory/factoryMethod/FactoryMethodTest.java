package com.bizideal.mn.factory.factoryMethod;

/**
 * @author : liulq
 * @date: 创建时间: 2018/4/2 10:25
 * @version: 1.0
 * @Description:
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        Factory factoryBMW320 = new FactoryBMW320();
        BMW bmw1 = factoryBMW320.createBMW();

        Factory factoryBMW523 = new FactoryBMW523();
        BMW bmw = factoryBMW523.createBMW();
    }
}
