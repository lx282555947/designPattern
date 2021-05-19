package com.learn.pattern.singleton;

import java.io.Serializable;

/**
 * 饿汉式
 */
public class Hungry implements Serializable {

    private static boolean flag = false;

    private final static Hungry HUNGRY = new Hungry();

    private Hungry() {
        synchronized (Hungry.class) {
            //如果已创建示例，则抛出异常
            if (flag) {
                throw new RuntimeException("实例已创建");
            }
            flag = true;
        }
    }

    public static Hungry getInstance() {
        return HUNGRY;
    }

    public Object readResolve() {
        return HUNGRY;
    }
}
