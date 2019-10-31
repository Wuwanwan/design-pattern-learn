package com.learn;

/**
 * 执行总裁
 *
 * @author wuww
 * @version 1.0
 */
public class CEO extends PriceHandler {

    /**
     * 处理折扣
     *
     * @param discount 折扣
     */
    @Override
    public void processDiscount(float discount) {
        if (0.55 >= discount) {
            System.out.println(String.format("%s批准了折扣%.2f", getClass().getName(), discount));
        } else {
            System.out.println(String.format("%s驳回了折扣%.2f", getClass().getName(), discount));
        }
    }
}
