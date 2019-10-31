package com.learn;

import java.util.*;

/**
 * @author wuww
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) throws Exception {

        Test test = new Test();
        System.out.println(test.romanToInt("D"));
    }


    public int romanToInt(String s) {
        Map<Character, Integer> rule = new HashMap<>();
        rule.put('I', 1);
        rule.put('V', 5);
        rule.put('X', 10);
        rule.put('L', 50);
        rule.put('C', 100);
        rule.put('D', 500);
        rule.put('M', 1000);

        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        int value = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (!stack.empty()) {
                if (rule.get(chars[i]) < rule.get(stack.peek())) {
                    value = value - rule.get(chars[i]);
                    stack.push(chars[i]);
                } else {
                    value = value + rule.get(chars[i]);
                    stack.push(chars[i]);
                }
            } else {
                value = value + rule.get(chars[i]);
                stack.push(chars[i]);
            }
        }

        return value;
    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String value = String.valueOf(x);
        char[] chars = value.toCharArray();
//        StringBuilder sBuilder = new StringBuilder();
        int length = chars.length;
        for (int i = length - 1; i >= length / 2; i--) {
            if (chars[i] != chars[length - 1 - i]) {
                return false;
            }
        }
//        return value.equals(sBuilder.toString());
        return true;
    }

    public int reverse3(int x) {
        long value = 0;
        while (x != 0) {
            value = x % 10 + value * 10;
            x = x / 10;
            if (value > Integer.MAX_VALUE || value < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int) value;
    }

    public int reverse2(int x) {
        List<Integer> list = new ArrayList<>();
        while (x != 0) {
            list.add(x % 10);
            x = x / 10;
        }
        long value = 0;
        for (int i = 0; i < list.size(); i++) {
            value = list.get(i) + value * 10;
            if (value > Integer.MAX_VALUE || value < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int) value;
    }

    public boolean isValid(String s) {
        // 定义规则
        Map<String, String> rule = new HashMap<>();
        rule.put("(", ")");
        rule.put("[", "]");
        rule.put("{", "}");

        // 拆分字符串
        char[] chars = s.toCharArray();
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < chars.length; i++) {
            list.add(String.valueOf(chars[i]));
        }

        // 将左括号添加到list中
        LinkedList<String> left = new LinkedList<>();
//        LinkedList<String> right = new LinkedList<>();
        for (String s1 : list) {
            // 判断是左括号还是右括号
            if (rule.containsKey(s1)) {
                left.add(s1);
            } else {
                // 如果没有左括号，直接返回 false
                if (left.isEmpty()) {
                    return false;
                }
//                right.add(s1);
                String lastLeft = left.getLast();
                String firstRight = rule.get(lastLeft);
                if (s1.equals(firstRight)) {
                    left.removeLast();
//                    right.removeLast();
                } else {
                    return false;
                }
            }
        }
        return left.isEmpty();
    }

    public boolean isValid2(String s) {
        // 定义规则
        Map<Character, Character> rule = new HashMap<>();
        rule.put(')', '(');
        rule.put(']', '[');
        rule.put('}', '{');

        // 拆分字符串
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            if (rule.containsKey(chars[i])) {
                if (stack.empty()) {
                    return false;
                }
                Character lastChar = stack.peek();
                if (rule.get(chars[i]).equals(lastChar)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(chars[i]);
            }
        }
        return stack.empty();
    }

    public int reverse(int x) {
        char[] chars = String.valueOf(x).toCharArray();
        StringBuilder sBuilder = new StringBuilder();
        if (x < 0) {
            sBuilder.append(chars[0]);
            for (int i = chars.length - 1; i > 0; i--) {
                sBuilder.append(chars[i]);
            }
        } else {
            for (int i = chars.length - 1; i >= 0; i--) {
                sBuilder.append(chars[i]);
            }
        }
        try {
            return Integer.parseInt(sBuilder.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
