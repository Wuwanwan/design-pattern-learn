package com.learn.abstractfac;

import java.io.FileNotFoundException;

/**
 * @author wuww
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
        // 获取颜色工厂
        AbstractFactory shapeFactory = FactoryProducer.choseFactory("shape");
        Shape circle = shapeFactory.createShape("circle");
        circle.draw();
        Shape square = shapeFactory.createShape("square");
        square.draw();

        // 获取形状工厂
        AbstractFactory colorFactory = FactoryProducer.choseFactory("color");
        Color blue = colorFactory.createColor("blue");
        blue.fill();
        Color red = colorFactory.createColor("red");
        red.fill();
        Color whi = colorFactory.createColor("白色");
        whi.fill();

    }

}
