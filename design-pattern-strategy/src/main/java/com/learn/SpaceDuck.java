package com.learn;

import com.learn.impl.FlyWithRocket;

/**
 * 太空鸭
 *
 * @author wuww
 * @version 1.0
 */
public class SpaceDuck extends Duck {

    public SpaceDuck() {
        super();
        super.setFlyStrategy(new FlyWithRocket());
    }

    @Override
    public void display() {
        System.out.println("我头戴余杭头盔");
    }
}
