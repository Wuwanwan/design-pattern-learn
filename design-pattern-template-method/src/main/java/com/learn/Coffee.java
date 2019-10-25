package com.learn;

/**
 * @author wuww
 * @version 1.0
 */
public class Coffee extends BaseRefreshDrink {

    @Override
    protected void brew() {
        System.out.println("将咖啡倒入沸水");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加牛奶和糖");
    }
}
