package com.learn;

import java.util.Random;

/**
 * @author wuww
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        PriceHandler priceHandler = PriceHandlerFactory.createPriceHandler();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            priceHandler.processDiscount(random.nextFloat());
        }

    }
}
