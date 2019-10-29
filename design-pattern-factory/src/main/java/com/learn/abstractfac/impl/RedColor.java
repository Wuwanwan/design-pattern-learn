package com.learn.abstractfac.impl;

import com.learn.abstractfac.Color;

/**
 * @author wuww
 * @version 1.0
 */
public class RedColor implements Color {
    /**
     * 填充颜色
     */
    public void fill() {
        System.out.println("红色");
    }
}
