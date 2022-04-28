package com.company.init_block;

public class Main {

    public static void main(String[] args) {
        Test test = new Test(10);
        System.out.println("Итоговый результат - " +test.get());
        Test test2 = new Test(20);
        System.out.println("Итоговый результат второго объекта - " +test2.get());
        System.out.println("Итоговый результат статического поля - " + Test.getJ());
    }


}
