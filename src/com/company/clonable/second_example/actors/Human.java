package com.company.clonable.second_example.actors;

public class Human implements Cloneable{

    private final String name;
    private final int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public Human clone() throws CloneNotSupportedException {
        return (Human) super.clone();
    }

}
