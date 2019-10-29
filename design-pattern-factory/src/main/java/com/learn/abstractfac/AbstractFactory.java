package com.learn.abstractfac;

import java.io.FileNotFoundException;

/**
 * @author wuww
 * @version 1.0
 */
public abstract class AbstractFactory {

    /**
     * 生产颜色
     *
     * @param colorStr 待生产的颜色
     * @return Color
     * @throws FileNotFoundException 不支持颜色
     */
    public abstract Color createColor(String colorStr) throws FileNotFoundException, ClassNotFoundException;

    /**
     * 生产形状
     *
     * @param shapeStr 待生产的形状
     * @return Shape
     * @throws FileNotFoundException 不支持的形状
     */
    public abstract Shape createShape(String shapeStr) throws FileNotFoundException, ClassNotFoundException;

}
