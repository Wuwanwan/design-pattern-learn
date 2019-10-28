package com.learn;

/**
 * 懒汉式
 *
 * @author wuww
 * @version 1.0
 */
public class LazySingleton {

    /**
     * 申明类的实例
     */
    private static LazySingleton lazySingleton;

    /**
     * 构造方法私有化，不允许外部直接创建对象
     */
    private LazySingleton() {
    }

    /**
     * 获取实例的方法
     *
     * @return LazySingleton
     */
    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

}
