package com.bizideal.mn.factory.abstractFactory;

/**
 * @author : liulq
 * @date: 创建时间: 2018/4/2 10:39
 * @version: 1.0
 * @Description:
 */
public class AbstractFactoryTest {

    // 我熟悉的设计模式：单例模式、工厂模式、代理模式

    // https://blog.csdn.net/jason0539/article/details/23020989
    // https://blog.csdn.net/jason0539/article/details/44976775
    // 简单工厂，只有一个工厂，增加一种产品，需要增加一个case判断
    // 工厂方法，有一个抽象工厂，多个工厂实例，每个工厂只生产一种产品，如宝马320、宝马523
    // 抽象工厂，有一个抽象工厂，多个工厂实例，每个工厂只生产一个产品族，如a引擎、a空调或者b引擎、b空调

    // 工厂方法和抽象工厂区别
    // 1、工厂方法只有一个抽象产品类，抽象工厂有多个
    // 2、工厂方法每个工厂只生产一个具体产品实例，抽象工厂生产多个
    // 3、抽象工厂增加产品族简单、增加产品等级结构却很难；工厂方法相反
    // 解释：抽象工厂增加产品族，只需添加一个工厂实现即可，增加等级结构，需要修改抽象工厂类，添加一个新的方法，
    // 然后所有的工厂实现类需要实现新增加的方法；工厂方法增加等级结构，只需要添加一个工厂实现即可，增加产品族，
    // 需要新增产品抽象类，然后修改抽象工厂，增加方法...

    // 工厂方法的作用？
    // 1、减少new的使用，进行封装，减少代码重复
    // 2、解耦，将对象的创建和使用分开
    public static void main(String[] args) {
        FactoryBMW320 factoryBMW320 = new FactoryBMW320();
        Engine engine = factoryBMW320.createEngine();
        Aircondition airCondition = factoryBMW320.createAirCondition();

        FactoryBMW523 factoryBMW523 = new FactoryBMW523();
        Engine engine1 = factoryBMW523.createEngine();
        Aircondition airCondition1 = factoryBMW523.createAirCondition();
    }
}
