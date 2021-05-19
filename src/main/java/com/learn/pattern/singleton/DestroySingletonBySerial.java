package com.learn.pattern.singleton;

import java.io.*;

/**
 * 通过序列化的方式破坏单例模式，要解决此问题，必须在类中声明readResolve的方法，反序列化的时候，会调用readResolve来获取对象
 */
public class DestroySingletonBySerial {

    public static final String PATH = "E:\\test.txt";

    public static void main(String[] args) throws Exception {
        writeObject();
        final Hungry hungry1 = readObject();
        final Hungry hungry2 = readObject();
        System.out.println(hungry1 == hungry2);
    }

    public static void writeObject() throws Exception {
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(PATH));
        Hungry instance = Hungry.getInstance();
        outputStream.writeObject(instance);
        outputStream.close();
    }

    public static Hungry readObject() throws Exception {
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(PATH));
        final Hungry object = (Hungry) inputStream.readObject();
        inputStream.close();
        return object;
    }
}
