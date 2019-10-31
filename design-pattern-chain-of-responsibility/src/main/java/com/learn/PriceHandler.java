package com.learn;

import lombok.Setter;

/**
 * 折扣处理
 *
 * @author wuww
 * @version 1.0
 */
@Setter
public abstract class PriceHandler {

    /**
     * 直接后继，用于传递请求
     */
    protected PriceHandler successor;

    /**
     * 工厂方法， 用于创建一个价格处理器
     *
     * @return PriceHandler
     */
    public static PriceHandler createPriceHandler() {
        // 创建各个对象
        PriceHandler slaves = new Slaves();
        Manager manager = new Manager();
        Director director = new Director();
        VicePresident vicePresident = new VicePresident();
        CEO ceo = new CEO();

        // 连起来
        slaves.setSuccessor(manager);
        manager.setSuccessor(director);
        director.setSuccessor(vicePresident);
        vicePresident.setSuccessor(ceo);

        return slaves;
    }

    /**
     * 处理折扣
     *
     * @param discount 折扣
     */
    public abstract void processDiscount(float discount);

}
