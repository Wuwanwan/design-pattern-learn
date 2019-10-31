package com.learn;

/**
 * @author wuww
 * @version 1.0
 */
public class Lead extends PriceHandler {
    /**
     * 处理折扣
     *
     * @param discount 折扣
     */
    @Override
    public void processDiscount(float discount) {
        if (0.15 >= discount){
            System.out.println(String.format("%s处理了折扣%.2f", getClass().getName(), discount));
        }else {
            successor.processDiscount(discount);
        }
    }
}
