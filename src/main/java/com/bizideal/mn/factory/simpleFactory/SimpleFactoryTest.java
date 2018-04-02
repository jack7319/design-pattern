package com.bizideal.mn.factory.simpleFactory;

/**
 * @author : liulq
 * @date: 创建时间: 2018/4/2 10:05
 * @version: 1.0
 * @Description: 简单工厂：不符合开闭原则：对扩展开放，对修改关闭
 *  但是这里每增加一种车型，就要在工厂类中增加判断逻辑
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        Factory factory = new Factory();
        BMW bwm = factory.createBWM(320);
    }
}
