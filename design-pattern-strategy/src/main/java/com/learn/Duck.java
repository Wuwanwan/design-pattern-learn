package com.learn;

/**
 * @author wuww
 * @version 1.0
 */
public abstract class Duck {

    private FlyStrategy flyStrategy;

    /**
     * 设置飞行策略
     *
     * @param flyStrategy 飞行策略
     */
    public void setFlyStrategy(FlyStrategy flyStrategy) {
        this.flyStrategy = flyStrategy;
    }

    public void fly() {
        flyStrategy.performFly();
    }

    public abstract void display();

}
