package com.bizideal.mn.factory.simpleFactory;

/**
 * @author : liulq
 * @date: 创建时间: 2018/4/2 9:59
 * @version: 1.0
 * @Description:
 */
public class Factory {

    public static BMW createBWM(int type) {
        switch (type) {
            case 320:
                return new BMW320();
            case 523:
                return new BMW523();
            default:
                break;
        }
        return null;
    }
}
