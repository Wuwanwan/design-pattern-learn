package com.learn;

/**
 * @author wuww
 * @version 1.0
 */
public class Tea extends BaseRefreshDrink {

    /**
     * 泡饮料
     */
    @Override
    protected void brew() {
        System.out.println("将茶倒入80度的水中泡制5分钟");
    }

    /**
     * 添加调味料
     */
    @Override
    protected void addCondiments() {
        System.out.println("加柠檬");
    }

    /**
     * 重写钩子函数，选择是否挂钩
     *
     * @return 是否挂钩
     */
    @Override
    protected boolean ifAddCondiments() {
        return false;
    }

}
