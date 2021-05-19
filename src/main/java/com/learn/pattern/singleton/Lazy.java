package com.learn.pattern.singleton;

/**
 * 懒汉式，双重校验方式
 */
public class Lazy {

    private Lazy() {
    }

    private static volatile Lazy instance;

    public synchronized static Lazy getInstance() {
        if (instance == null) {
            instance = new Lazy();
        }
        return instance;
    }

    public static Lazy getInstance2() {
        if (instance == null) {
            synchronized (Lazy.class) {
                if (instance == null) {
                    instance = new Lazy();
                }
            }
        }
        return instance;
    }
}
