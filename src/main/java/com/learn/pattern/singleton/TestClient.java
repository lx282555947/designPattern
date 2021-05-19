package com.learn.pattern.singleton;

public class TestClient {
    public static void main(String[] args) {
        final Hungry instance1 = Hungry.getInstance();
        final Hungry instance2 = Hungry.getInstance();
        System.out.println(instance1 == instance2);

        System.out.println("==================");
        Lazy lazy1 = Lazy.getInstance();
        Lazy lazy2 = Lazy.getInstance();
        System.out.println(lazy1 == lazy2);

        System.out.println("===================");
        Lazy2 lazy21 = Lazy2.getInstance();
        Lazy2 lazy22 = Lazy2.getInstance();
        System.out.println(lazy21 == lazy22);

        System.out.println("===================");
        Hungry1 hungry1 = Hungry1.INSTANCE;
        Hungry1 hungry2 = Hungry1.INSTANCE;
        System.out.println(hungry1 == hungry2);
    }
}
