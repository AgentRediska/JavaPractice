package com.company.comparator_comparable;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product("Cranberry", 34);
        Product product2 = new Product("Strawberry", 41);
        Product product3 = new Product("Raspberry", 3);
        Product product4 = new Product("Pineapple", 10);

        List<Product> list = new ArrayList<>();
        list.add(product1); list.add(product2);
        list.add(product3); list.add(product4);

        comparatorExample(list);
        printList(list);
    }

    public static void comparatorExample(List<Product> list) {
        System.out.println("Before sort with comparator");
        printList(list);

        System.out.println("After sort with comparator");
        ProductComparator productComparator = new ProductComparator();
        list.sort(productComparator);
        printList(list);
    }

    public static void printList(List<Product> list) {
        for (Product product : list) {
            System.out.println(product.getProductName() + " " + product.getProductPrice());
        }
    }
}
