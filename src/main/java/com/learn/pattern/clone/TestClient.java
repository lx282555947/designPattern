package com.learn.pattern.clone;

import java.awt.print.Book;

public class TestClient {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student stu = new Student();

        Book book = new Book();
        stu.setBook(book);

        Student clone = stu.clone();
        System.out.println(stu == clone);

        System.out.println(stu.getBook() == clone.getBook());

    }
}
