package com.company.types_of_classes.local_class;

public class LocalExample {

    /*
    Локальные классы способны работать только с final переменными метода.
    Все дело в том, что экземпляры локальных классов способны сохраняться
    в «куче» после завершения работы метода, а переменная может быть стёрта.
    Если же переменная объявлена final, то компилятор может сохранить копию переменной
    для дальнейшего использования объектом. И еще: с 8+ версий Java можно использовать
    не final переменные в локальных классах, но только при условии, что они не будут изменяться.
    Локальные классы нельзя объявлять с модификаторами доступа.
    Локальные классы обладают доступом к переменным метода.
    */
    public static void main(String[] args) {
        Person person = new Person("Nikita", "Sholohova", "17");
        Person.AddressContainer i = person.getAddressContainer();
        Person.AddressContainer address = person.getAddressContainer();
        System.out.println("Address: street - " + address.getStreet() + ", house - " + address.getHouse());
    }
}

 class Person {
    private String name, street, house;

    public Person(String name, String street, String house) {
        this.name = name;
        this.street = street;
        this.house = house;
    }

    interface AddressContainer {
        String getStreet();

        String getHouse();
    }

    public AddressContainer getAddressContainer() {
        class PersonAddressContainer implements AddressContainer {
            final String street = Person.this.street, house = Person.this.house;

            @Override
            public String getStreet() {
                return this.street;
            }

            @Override
            public String getHouse() {
                return this.house;
            }
        }

        return new PersonAddressContainer();
    }
}
