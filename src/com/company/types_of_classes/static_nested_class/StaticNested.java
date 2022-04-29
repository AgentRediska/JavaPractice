package com.company.types_of_classes.static_nested_class;

public class StaticNested {

    /*
    1. Количество классов уменьшилось.
    2. Все классы внутри их класса-родителя.
    Мы способны прослеживать всю иерархию без открытия каждого класса отдельно.
    3. Мы можем обратиться к классу Building,
    а IDE уже будет подсказывать весь список всех подклассов данного класса.
    Это будет упрощать поиск нужных классов и показывать всю картину более цело.
     */
    public static void main(String[] args) {
        Building.House house = new Building.House("House", "23 11");
        Building.House house2 = new Building.House("House2", "11 3");
        System.out.println("Hashcode 1 house - " + house.hashCode()
                + ", Hashcode 2 house - "+ house2.hashCode());
    }
}

abstract class Building {
    private String name, address, type;

    public Building(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static class Platform extends Building {

        public Platform(String name, String address) {
            super(name, address);
            setType("Platform");
        }
    }

    public static class House extends Building {

        public House(String name, String address) {
            super(name, address);
            setType("House");
        }
    }
}
