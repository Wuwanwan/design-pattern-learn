package com.learn.abstractfac.impl;

import com.learn.abstractfac.Shape;

/**
 * @author wuww
 * @version 1.0
 */
public class SquareShape implements Shape {
    /**
     * 生产形状
     */
    public void draw() {
        System.out.println("方形");
    }
}
