package com.learn.pattern.clone;

import java.awt.print.Book;

public class Student implements Cloneable {

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    private Book book;

    /**
     * 浅克隆，对象中的对象只是引用相同
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }
}
