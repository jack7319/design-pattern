package com.bizideal.mn.strategy;

/**
 * @author : liulq
 * @date: 创建时间: 2018/4/2 14:29
 * @version: 1.0
 * @Description:
 */
public abstract class Role {

    protected String name;

    protected IDisplayBehiver displayBehiver;
    protected IAttackBehiver attackBehiver;
    protected IDefendBehiver defendBehiver;
    protected IRunBehiver runBehiver;

    public Role setDisplayBehiver(IDisplayBehiver displayBehiver) {
        this.displayBehiver = displayBehiver;
        return this;
    }

    public Role setAttackBehiver(IAttackBehiver attackBehiver) {
        this.attackBehiver = attackBehiver;
        return this;
    }

    public Role setDefendBehiver(IDefendBehiver defendBehiver) {
        this.defendBehiver = defendBehiver;
        return this;
    }

    public Role setRunBehiver(IRunBehiver runBehiver) {
        this.runBehiver = runBehiver;
        return this;
    }

    protected void display() {
        displayBehiver.display();
    }

    protected void attack() {
        attackBehiver.attack();
    }

    protected void defend() {
        defendBehiver.defend();
    }

    protected void run() {
        runBehiver.run();
    }

}
