package com.company.clonable.book;

public abstract class Book implements Cloneable{

    private final String name;
    private final String color;

    public Book(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
