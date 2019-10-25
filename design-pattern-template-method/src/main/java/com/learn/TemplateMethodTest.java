package com.learn;

/**
 * @author wuww
 * @version 1.0
 */
public class TemplateMethodTest {

    public static void main(String[] args) {
        System.out.println("开始泡咖啡...");
        BaseRefreshDrink coffee = new Coffee();
        coffee.refreshDrinkTemplate();
        System.out.println("咖啡泡制完成！");

        System.out.println("————————————————");

        System.out.println("开始泡茶...");
        BaseRefreshDrink tea = new Tea();
        tea.refreshDrinkTemplate();
        System.out.println("泡茶完成！");
    }

}
