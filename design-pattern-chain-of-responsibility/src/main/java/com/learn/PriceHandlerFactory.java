package com.learn;

/**
 * 价格处理工厂
 *
 * @author wuww
 * @version 1.0
 */
public class PriceHandlerFactory {

    /**
     * 工厂方法， 用于创建一个价格处理器
     *
     * @return PriceHandler
     */
    public static PriceHandler createPriceHandler() {
        // 创建各个对象
        PriceHandler slaves = new Slaves();
        PriceHandler lead = new Lead();
        PriceHandler manager = new Manager();
        PriceHandler director = new Director();
        PriceHandler vicePresident = new VicePresident();
        PriceHandler ceo = new CEO();

        // 连起来
        slaves.setSuccessor(lead);
        lead.setSuccessor(manager);
        manager.setSuccessor(director);
        director.setSuccessor(vicePresident);
        vicePresident.setSuccessor(ceo);

        return slaves;
    }

}
