package com.learn;

/**
 * @author wuww
 * @version 1.0
 */
public class SingletonTest {

    public static void main(String[] args) {
        // 饿汉模式
        HungrySingleton instence1 = HungrySingleton.getInstence();
        HungrySingleton instence2 = HungrySingleton.getInstence();
        if (instence1 == instence2) {
            System.out.println("是同一个实例");
        } else {
            System.out.println("不是同一个实例");
        }

        System.out.println("——————————————");
        // 懒汉模式
        LazySingleton instance3 = LazySingleton.getInstance();
        LazySingleton instance4 = LazySingleton.getInstance();
        if (instance3 == instance4) {
            System.out.println("是同一个实例");
        } else {
            System.out.println("不是同一个实例");
        }

    }

}
