package com.learn.pattern.singleton;

import java.lang.reflect.Constructor;

/**
 * 通过反射破坏单例模式，解决此问题的关键在于调用构造参数的时候，需要判断是否已经创建了实例，若创建则抛异常
 */
public class DestorySingletonByReflect {

    public static void main(String[] args) throws Exception {
        final Hungry instance1 = getInstance();
        final Hungry instance2 = getInstance();
        System.out.println(instance1 == instance2);
    }

    public static Hungry getInstance() throws Exception {
        final Class<Hungry> hungryClass = Hungry.class;
        final Constructor<Hungry> cons = hungryClass.getDeclaredConstructor();
        cons.setAccessible(true);
        return cons.newInstance();
    }
}
