package com.company.assert_example;

public class Main {

    public static void main(String[] args) {
        int i = 1;
        int j = 0;
        divide(i, j);
    }

    public static void divide(int i, int j) {
//        if (j == 0) {
//            throw new ArithmeticException();
//        }

        assert (j == 0);
    }
}
