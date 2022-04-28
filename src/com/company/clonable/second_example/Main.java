package com.company.clonable.second_example;

import com.company.clonable.second_example.actors.Bag;
import com.company.clonable.second_example.actors.Book;
import com.company.clonable.second_example.actors.Human;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        firstTask();
        secondTask();
    }

    public static void firstTask() throws CloneNotSupportedException {
        Human firstHuman = new Human("Denis", 23);
        Human secondHuman = firstHuman.clone();

        System.out.println("*First human*\n hashcode - " + firstHuman.hashCode() + ", name - "
                + firstHuman.getName() + ", age - " + firstHuman.getAge());
        System.out.println("*Second human*\n hashcode - " + secondHuman.hashCode() + ", name - "
                + secondHuman.getName() + ", age - " + secondHuman.getAge());
    }

    public static void secondTask() throws CloneNotSupportedException {
        Book testBook = new Book("Book Name");
        Bag firstBag = new Bag("black", "big");
        firstBag.setBook(testBook);
        Bag secondBag = firstBag.clone();

        System.out.println("*First bag*\n hashcode - " + firstBag.hashCode() + ", color - "
                + firstBag.getColor() + ", type - " + firstBag.getType()
                + ", bookHashCode - " + firstBag.getBooks().get(0).hashCode());

        System.out.println("*Second bag*\n hashcode - " + secondBag.hashCode() + ", color - "
                + secondBag.getColor() + ", type - " + secondBag.getType()
                + ", bookHashCode - " + secondBag.getBooks().get(0).hashCode());
    }
}
