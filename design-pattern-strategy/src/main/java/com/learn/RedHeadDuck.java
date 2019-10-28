package com.learn;

import com.learn.impl.FlyWithWind;

/**
 * 红头鸭
 *
 * @author wuww
 * @version 1.0
 */
public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        super();
        super.setFlyStrategy(new FlyWithWind());
    }

    @Override
    public void display() {
        System.out.println("我的头是红色的");
    }
}
