package com.learn.impl;

import com.learn.FlyStrategy;

/**
 * @author wuww
 * @version 1.0
 */
public class FlyNoWay implements FlyStrategy {

    /**
     * 执行飞行
     */
    public void performFly() {
        System.out.println("我不会飞行");
    }

}
