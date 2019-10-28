package com.learn.impl;

import com.learn.FlyStrategy;

/**
 * @author wuww
 * @version 1.0
 */
public class FlyWithRocket implements FlyStrategy {

    /**
     * 执行飞行
     */
    public void performFly() {
        System.out.println("我用火箭飞行");
    }

}
