package com.learn;

import java.util.ArrayList;

/**
 * @author wuww
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.fly();

        System.out.println("————————————");
        Duck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        redHeadDuck.fly();

        System.out.println("————————————");
        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.fly();

        System.out.println("————————————");
        Duck bigYellowDuck = new BigYellowDuck();
        bigYellowDuck.display();
        bigYellowDuck.fly();

        System.out.println("————————————");
        Duck spaceDuck = new SpaceDuck();
        spaceDuck.display();
        spaceDuck.fly();

    }

}
