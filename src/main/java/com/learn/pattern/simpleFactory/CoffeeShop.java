package com.learn.pattern.simpleFactory;

public class CoffeeShop {

    public Coffee orderCoffee(String type) {
        final Coffee instance = CoffeeFactory.getInstance(type);
        instance.print();
        return instance;
    }
}
