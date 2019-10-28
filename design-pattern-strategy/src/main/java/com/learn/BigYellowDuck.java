package com.learn;

import com.learn.impl.FlyNoWay;

/**
 * @author wuww
 * @version 1.0
 */
public class BigYellowDuck extends Duck {

    public BigYellowDuck(){
        super();
        super.setFlyStrategy(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("我身体很大，全身发黄");
    }
}
