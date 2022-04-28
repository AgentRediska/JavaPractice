package com.company.clonable;

import com.company.clonable.book.Book;
import com.company.clonable.book.PlotBook;
import com.company.clonable.book.WarBook;

import java.util.List;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Shelf shelf = setBooksToInShelf();

            Shelf cloneShelf = shelf.clone();
            cloneShelf.getBook(0);
            cloneShelf.getBook(1);

        List<Book> list = shelf.getBooks();
        for (Book book : list) {
            System.out.println(book.getName());
        }
    }

    public static Shelf setBooksToInShelf() {
        Shelf shelf = new Shelf();
        Book warBook = new WarBook("Heroes of war", "black");
        Book plotBook = new PlotBook("Tom's story", "yellow");
        Book warBook2 = new WarBook("Heroes of war 2", "black");
        Book warBook3 = new WarBook("Heroes of war 3", "black");
        Book plotBook3 = new PlotBook("Tom's story 3", "red");
        Book plotBook2 = new PlotBook("Tom's story 2", "orange");

        shelf.setBook(warBook);
        shelf.setBook(plotBook);
        shelf.setBook(warBook2);
        shelf.setBook(warBook3);
        shelf.setBook(plotBook2);
        shelf.setBook(plotBook3);

        return shelf;
    }
}
