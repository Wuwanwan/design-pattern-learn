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
     * 处理折扣
     *
     * @param discount 折扣
     */
    public abstract void processDiscount(float discount);

}
