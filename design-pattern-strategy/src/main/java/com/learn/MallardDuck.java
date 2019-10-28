package com.learn;

import com.learn.impl.FlyWithWind;

/**
 * 绿脖鸭
 *
 * @author wuww
 * @version 1.0
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        super();
        super.setFlyStrategy(new FlyWithWind());
    }

    @Override
    public void display() {
        System.out.println("我是绿脖鸭");
    }

}
