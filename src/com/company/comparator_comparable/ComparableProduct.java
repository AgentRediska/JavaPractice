package com.company.comparator_comparable;

public class ComparableProduct implements Comparable<ComparableProduct>{

    private String productName;
    private Integer productPrice;

    public ComparableProduct(String productName, Integer productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    @Override
    public int compareTo(ComparableProduct o) {
        if(this.productPrice == o.productPrice) {
            return 0;
        }
        if(this.productPrice > o.productPrice) {
            return -1;
        }
        else return 1;
    }
}
