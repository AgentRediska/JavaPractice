package com.company.iterator_hashcode_equals;

import com.sun.jndi.ldap.Ber;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Berry product1 = new Berry("Cranberry", 34);
        Berry product2 = new Berry("Strawberry", 41);
        Berry product3 = new Berry("Raspberry", 3);
        Berry product4 = new Berry("Pineapple", 10);
        Berry product5 = new Berry("Pineapple", 10);
        Berry product6 = new Berry("Cranberry", 34);
        Berry product7 = product1;
        Berry product8 = product2;

        List<Berry> list = new ArrayList<>();
        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product7);
        list.add(product8);
        list.add(product4);
        list.add(product5);
        list.add(product6);
        System.out.println("List size before: " + list.size());
        removeIdenticalObjects(list);
        System.out.println("List size after: " + list.size());
        for (Berry berry : list) {
            System.out.println(berry.getProductName() + " " +berry.getProductPrice());
        }
    }

    public static void removeIdenticalObjects(List<Berry> productList) {
        LinkedList<Berry> itList = new LinkedList<>(productList);
        Iterator<Berry> fakeIterator = itList.iterator();

        while (fakeIterator.hasNext()) {
            int countOfDuplicated = 0;
            Berry berry = fakeIterator.next();
            Iterator<Berry> iterator = productList.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().equals(berry)) {
                    countOfDuplicated++;
                    if (countOfDuplicated > 1) {
                        iterator.remove();
                    }
                }
            }
        }
    }

}
