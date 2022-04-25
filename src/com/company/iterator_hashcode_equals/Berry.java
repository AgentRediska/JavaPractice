package com.company.iterator_hashcode_equals;

import java.util.Objects;

public class Berry {

    private String productName;
    private Integer productPrice;

    public Berry(String productName, Integer productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Berry berry = (Berry) o;
        if(Objects.equals(this.hashCode(), berry.hashCode())) return true;
        return this.productName.equals(berry.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, productPrice);
    }

    public Integer getProductPrice() {
        return productPrice;
    }

}
