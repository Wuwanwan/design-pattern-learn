package com.learn;

/**
 * @author wuww
 * @version 1.0
 */
public class Slaves extends PriceHandler {
    /**
     * 处理折扣
     */
    @Override
    public void processDiscount(float discount) {
        if (0.05 >= discount) {
            System.out.println(String.format("%s处理了折扣%.2f", getClass().getName(), discount));
        }else {
            successor.processDiscount(discount);
        }
    }
}
