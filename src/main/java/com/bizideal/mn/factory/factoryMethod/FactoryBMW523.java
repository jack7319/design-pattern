package com.bizideal.mn.factory.factoryMethod;

/**
 * @author : liulq
 * @date: 创建时间: 2018/4/2 10:22
 * @version: 1.0
 * @Description:
 */
public class FactoryBMW523 implements Factory {

    public BMW createBMW() {
        return new BMW523();
    }
}
