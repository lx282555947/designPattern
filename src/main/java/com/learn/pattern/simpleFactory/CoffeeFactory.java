package com.learn.pattern.simpleFactory;

public class CoffeeFactory {

    public static Coffee getInstance(String type) {
        if ("ame".equals(type)) {
            return new AmeCoffee();
        } else if ("latte".equals(type)) {
            return new LatteCoffee();
        } else {
            throw new RuntimeException("无此咖啡");
        }
    }
}
