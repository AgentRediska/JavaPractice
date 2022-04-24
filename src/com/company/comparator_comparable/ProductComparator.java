package com.company.comparator_comparable;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        if(o1.getProductPrice() == o2.getProductPrice()) {
            return 0;
        }
        if(o1.getProductPrice() > o2.getProductPrice()) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
