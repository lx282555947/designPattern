package com.learn.pattern.simpleFactory;

public abstract class Coffee {


    abstract void print();

    public void addMilk() {
        System.out.println("添加牛奶");
    }

    public void addSugar() {
        System.out.println("添加糖");
    }
}
