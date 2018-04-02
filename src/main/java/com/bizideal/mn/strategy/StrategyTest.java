package com.bizideal.mn.strategy;

/**
 * @author : liulq
 * @date: 创建时间: 2018/4/2 14:33
 * @version: 1.0
 * @Description:
 */
public class StrategyTest {

    public static void main(String[] args) {
        Role qf = new RoleA("乔峰");
        qf.setAttackBehiver(new AttackJysg()).setDefendBehiver(new DefendTbs()).setDisplayBehiver(new DisplayYs1()).setRunBehiver(new RunJctq());
        qf.display();
        qf.attack();
        qf.defend();
        qf.run();
    }
}
