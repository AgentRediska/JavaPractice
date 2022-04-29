package com.company.types_of_classes.anonymous_classes;

public class Anonymous {

    /*
    тело класса является очень коротким;
    нужен только один экземпляр класса;
    класс используется в месте его создания или сразу после него;
    имя класса не важно и не облегчает понимание кода.
     */
    public static void main(String[] args) {

        //анонимный экземпляр через наследование
        get( new Animal() {
            @Override
            public void meow() {
                System.out.println("Anonymous");
            }
        });

        //анонимный экземпляр через реализацию интерфейса
        getAnonymousWithInterface( new Example() {
            @Override
            public void interfaceTestWithParameter(String testString) {
                System.out.println("Implement through anonymous class with parameter");
            }
        });

        //анонимный экземлпяр через реализацию интерфейса через лямбду
        getAnonymousWithInterface(testString -> System.out.println("Implement through anonymous class with parameter"));


        getAnonymousWithoutParameters(() -> System.out.println("Implement through anonymous class with lambda"));


    }

    public static void get( Animal a) {
        a.meow();
    }

    public static void getAnonymousWithInterface( Example ex) {
        ex.interfaceTestWithParameter("Anonymous through abstract class");
    }

    public static void getAnonymousWithoutParameters( ExampleSecond ex) {
        ex.interfaceTest();
    }

}


abstract class Animal {

    public void meow() {
        System.out.println("Meow");
    }
}

interface Example {

    void interfaceTestWithParameter(String testString);

}

interface ExampleSecond {

    void interfaceTest();
}


