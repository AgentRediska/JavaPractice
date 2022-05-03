package com.company.collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        //добавить элемент в начало
        List<Integer> list = createList();
        Vector<Integer> vectorList = new Vector<>();
        addElements(list, vectorList);
        ArrayList<Integer> arrayList = new ArrayList<>();
        addElements(list, arrayList);
        LinkedList<Integer> linkedList = new LinkedList<>();
        addElements(list, linkedList);
    }

    public static List<Integer> createList() {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 100; i++) {
            list.add(i);
        }
        return list;
    }

    public static <E> void addElements(List<E> basicList, Collection<E> newCollection) {
        newCollection.addAll(basicList);
    }

}
