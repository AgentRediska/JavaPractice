package com.company.collections;

import java.util.*;

public class AllTypesOfMap {

    public static void main(String[] args) {

        numberOfRepetitions();

       /* String[] names = {"One", "Two", "Three", "Two", "Ones"};
        System.out.println("ArrayList");
        showArrayList(names, new ArrayList());
        System.out.println("LinkedList");
        showArrayList(names, new LinkedList());
        System.out.println("HashSet");
        showArrayList(names, new HashSet());
        System.out.println("LinkedHashSet");
        showArrayList(names, new LinkedHashSet());
        System.out.println("TreeSet");
        showArrayList(names, new TreeSet());*/
    }

    public static void showAllElements(Collection collection) {
        for (Object o : collection) {
            System.out.print(o + ", ");
        }
        System.out.println();
    }

    public static void showArrayList(String[] names, Collection col) {
        for (int i = 0; i < names.length; i++) {
            col.add(names[i]);
        }
        showAllElements(col);
    }

    public static void numberOfRepetitions() {
        Random random = new Random(47);
        Map<Integer, Integer> m = new HashMap<>();
        for(int i = 0; i < 1000; i++) {
            int r = random.nextInt(20);
            Integer freq = m.get(r);
            m.put(r, freq == null ? 1 : freq + 1);
        }
        System.out.println(m);
    }
}
