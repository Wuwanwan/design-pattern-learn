package com.learn;

import com.learn.impl.FlyNoWay;

/**
 * 橡胶鸭
 *
 * @author wuww
 * @version 1.0
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        super();
        super.setFlyStrategy(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("我全身发黄，嘴巴很红");
    }
}
