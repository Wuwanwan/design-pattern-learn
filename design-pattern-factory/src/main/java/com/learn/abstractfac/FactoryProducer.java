package com.learn.abstractfac;

/**
 * 工厂选择器
 *
 * @author wuww
 * @version 1.0
 */
public class FactoryProducer {

    public static AbstractFactory choseFactory(String factory) {
        if ("color".equalsIgnoreCase(factory)) {
            return new ColorFactory();
        } else if ("shape".equalsIgnoreCase(factory)) {
            return new ShapeFactory();
        }
        return null;
    }

}
