package com.company.iterator_hashcode_equals.comparator;

import com.company.iterator_hashcode_equals.Berry;

import java.util.Comparator;

public class BerryComparatorSortByPrice implements Comparator<Berry> {
    @Override
    public int compare(Berry o1, Berry o2) {
        return o1.getProductPrice().compareTo(o2.getProductPrice());
    }
}
