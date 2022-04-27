package com.company.clonable;

import com.company.clonable.book.Book;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Shelf implements Cloneable{

    private List<Book> bookList = new LinkedList<>();

    public final Book getBook(int index) {
        Book book = bookList.get(index);
        bookList.remove(index);
        return book;
    }

    public final List<Book> getBooks() {
        return bookList;
    }

    public final void setBook(Book book) {
        bookList.add(book);
    }

    @Override
    protected Shelf clone() throws CloneNotSupportedException {
        Shelf cloned = (Shelf) super.clone();
        cloned.bookList = new ArrayList<>(bookList.size());
        for (Book book : bookList) {
            cloned.bookList.add((Book) book.clone());
        }
        return cloned;
    }
}
