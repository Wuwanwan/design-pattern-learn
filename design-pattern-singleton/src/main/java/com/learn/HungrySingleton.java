package com.learn;

/**
 * 饿汉式
 *
 * @author wuww
 * @version 1.0
 */
public class HungrySingleton {

    // 2. 创建实例
    private static HungrySingleton hungrySingleton = new HungrySingleton();

    /**
     * 1. 构造方法私有化，禁止外部创建
     */
    private HungrySingleton() {
    }

    /**
     * 3. 提供获取实例的方法
     *
     * @return HungrySingleton
     */
    public static HungrySingleton getInstence() {
        return hungrySingleton;
    }

}
