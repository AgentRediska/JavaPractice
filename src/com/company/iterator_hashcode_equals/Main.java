package com.company.iterator_hashcode_equals;

import com.company.iterator_hashcode_equals.comparator.BerryComparatorSortByName;
import com.company.iterator_hashcode_equals.comparator.BerryComparatorSortByPrice;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Berry> list = createList();
        System.out.println("List size: " + list.size());
        printList(list);

        removeIdenticalObjectWithoutIterator(list);

        removeIdenticalObjects(list);
        System.out.println("List size after: " + list.size());
        printList(list);

        System.out.println("List after sort by name: ");
        sortBerriesByName(list);
        printList(list);

        System.out.println("List after sort by price: ");
        sortBerriesByPrice(list);
        printList(list);
    }

    public static List<Berry> createList() {
        Berry product1 = new Berry("Cranberry", 34);
        Berry product2 = new Berry("Strawberry", 41);
        Berry product3 = new Berry("Raspberry", 3);
        Berry product4 = new Berry("Pineapple", 111);
        Berry product5 = new Berry("Pineapple", 10);
        Berry product6 = new Berry("Cranberry", 324);

        List<Berry> list = new ArrayList<>();
        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);
        list.add(product5);
        list.add(product6);
        return list;
    }

    public static void printList(List<Berry> list) {
        for (Berry berry : list) {
            System.out.println(berry.getProductName() + " - " + berry.getProductPrice());
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

    public static void removeIdenticalObjectWithoutIterator(List<Berry> productList) {
        HashMap<Berry, Integer> countRepeatBerries = new HashMap<>();
        for (Berry berry : productList) {
            Integer count = countRepeatBerries.get(berry);
            if ((count == null)) {
                countRepeatBerries.put(berry, 1);
            } else {
                countRepeatBerries.put(berry, count + 1);
            }
        }
        Set<Berry> uniqBerries = countRepeatBerries.keySet();
        System.out.println(countRepeatBerries);
        System.out.println(uniqBerries);

    }

    public static void sortBerriesByName(List<Berry> list) {
        Comparator comparator = new BerryComparatorSortByName();
        list.sort(comparator);
    }

    public static void sortBerriesByPrice(List<Berry> list) {
        Comparator comparator = new BerryComparatorSortByPrice();
        list.sort(comparator);
    }

}
