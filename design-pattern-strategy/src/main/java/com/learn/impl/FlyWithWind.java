package com.learn.impl;

import com.learn.FlyStrategy;

/**
 * @author wuww
 * @version 1.0
 */
public class FlyWithWind implements FlyStrategy {

    /**
     * 执行飞行
     */
    public void performFly() {
        System.out.println("振翅高飞");
    }
}
