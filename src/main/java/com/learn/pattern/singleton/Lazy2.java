package com.learn.pattern.singleton;

/**
 * 静态内部类实现方式
 * 静态内部类，只有在被调用的时候才会加载，因为被static修饰，因此只会加载一次，因为final修饰，其不可更改
 */
public class Lazy2 {

    private Lazy2() {
    }

    private static class LazyHolder {
        private static final Lazy2 INSTANCE = new Lazy2();
    }

    public static Lazy2 getInstance() {
        return LazyHolder.INSTANCE;
    }
}
