package com.learn;

/**
 * 抽象基类，为所有子类提供一个算法框架
 * <p>
 * 提神饮料
 *
 * @author wuww
 * @version 1.0
 */
public abstract class BaseRefreshDrink {

    /**
     * 制备饮料的模板方法
     * 指定了所有子类共同遵循的算法框架
     */
    protected final void refreshDrinkTemplate() {
        //（1）把水煮沸（boilWater）
        boilWater();
        //（2）泡饮料（brew）
        brew();
        //（3）把饮料倒进杯子（pourInCup）
        pourInCup();
        //（4）加调味料（addCondiments）
        if (ifAddCondiments()) {
            addCondiments();
        }
    }

    /**
     * 基本方法，把水煮沸
     */
    private void boilWater() {
        System.out.println("把水煮沸");
    }

    /**
     * 抽象的基本方法，泡饮料
     */
    protected abstract void brew();

    /**
     * 基本方法，把饮料导入杯子
     */
    private void pourInCup() {
        System.out.println("把饮料倒进杯子");
    }

    /**
     * Hook，钩子函数，提供一个默认或空的实现
     * 具体的子类可以自行决定是否挂钩以及如何挂钩
     *
     * @return 是否加入饮料
     */
    protected boolean ifAddCondiments() {
        return true;
    }

    /**
     * 抽象基本方法，添加调味料
     */
    protected abstract void addCondiments();
}
