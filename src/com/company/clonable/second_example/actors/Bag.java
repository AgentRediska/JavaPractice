package com.company.clonable.second_example.actors;

import java.util.LinkedList;
import java.util.List;

public class Bag implements Cloneable {

    private List<Book> books = new LinkedList<>();
    private final String color;
    private final String type;

    public Bag(String color, String type) {
        this.color = color;
        this.type = type;

    }

    public final void setBook(Book book) {
        books.add(book);
    }

    public final List<Book> getBooks() {
        return books;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    @Override
    public Bag clone() throws CloneNotSupportedException {
        Bag bagClone = (Bag) super.clone();
        bagClone.books = new LinkedList<>();
        for (Book book : books) {
            bagClone.books.add(book.clone());
        }
        return bagClone;
    }
}
