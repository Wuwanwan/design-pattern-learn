package com.learn.method;

import java.io.FileNotFoundException;

/**
 * @author wuww
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) throws FileNotFoundException {
        HearInterface hear = HearFactory.createByKey("right");
        hear.draw();

        System.out.println("-------------");
        HearInterface hear2 = HearFactory.createByClass("com.learn.method.LeftHearInterface");
        hear2.draw();

        System.out.println("-------------");
        HearInterface hear3 = HearFactory.createByClassKey("right");
        hear3.draw();


    }

}
