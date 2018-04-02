package com.bizideal.mn.factory.factoryMethod;

/**
 * @author : liulq
 * @date: 创建时间: 2018/4/2 10:21
 * @version: 1.0
 * @Description:
 */
public class FactoryBMW320 implements Factory{

    public BMW createBMW() {
        return new BMW320();
    }
}
