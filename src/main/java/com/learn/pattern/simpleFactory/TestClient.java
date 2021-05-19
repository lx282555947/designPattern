package com.learn.pattern.simpleFactory;

public class TestClient {
    public static void main(String[] args) {
        CoffeeShop coffeeShop = new CoffeeShop();
        final Coffee coffee = coffeeShop.orderCoffee("ame");
        coffee.addMilk();
        coffee.addSugar();
    }
}
