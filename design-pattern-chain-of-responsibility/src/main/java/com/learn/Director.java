package com.learn;

/**
 * 主管
 *
 * @author wuww
 * @version 1.0
 */
public class Director extends PriceHandler {
    /**
     * 处理折扣
     *
     * @param discount 折扣
     */
    @Override
    public void processDiscount(float discount) {
        if (0.4 >= discount) {
            System.out.println(String.format("%s批准了折扣%.2f", getClass().getName(), discount));
        }else {
            successor.processDiscount(discount);
        }
    }
}
