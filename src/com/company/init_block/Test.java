package com.company.init_block;

public class Test {
    private int i;
    private static int j;

    static {
        j = 1000;
        System.out.println("static init block - " + j);
    }

    {
        i = 100;
        System.out.println("init block - " + i);
    }

    public Test(int i) {
        this.i = i;
        System.out.println("constructor - " + i);
    }

    public int get() {
        return i;
    }

    public static int getJ() {
        return j;
    }
}
