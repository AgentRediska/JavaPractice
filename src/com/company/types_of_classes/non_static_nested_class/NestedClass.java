package com.company.types_of_classes.non_static_nested_class;

public class NestedClass {

    /*   Особенности нестатических вложенных классов Java:
     Они существуют только у объектов, потому для их создания нужен объект.
     Другими словами: мы укомплектовали наше крыло так, чтобы оно было частью самолета, потому,
     чтобы создать крыло, нам нужен самолет, иначе оно нам не нужно.
     Внутри Java класса не может быть статических переменных. Если вам нужны какие-то константы или что-либо еще статическое,
     выносить их нужно во внешний класс. Это связано с тесной связью нестатического вложенного класса с внешним классом.
     У класса полный доступ ко всем приватным полям внешнего класса. Данная особенность работает в две стороны.
     Можно получить ссылку на экземпляр внешнего класса. Пример: Airplane.this – ссылка на самолет, this – ссылка на крыло.
   */

    public static void main(String[] args) {
        Airplane airplane = new Airplane("AirBus", "34d22", "222");
        //можно обращаться к методам вложенного класса
        airplane.getLeftWing().excess();
    }
}

class Airplane {
    private String name, id, flight;
    private Wing leftWing = new Wing("Red", "X3");
    private Wing rightWing = new Wing("Blue", "X3");

    public Airplane(String name, String id, String flight) {
        this.name = name;
        this.id = id;
        this.flight = flight;

    }

    private void excess() {
        //есть доступ к приватным полям вложенного внутреннего класса
       String ex =  leftWing.color;
    }

    public Wing getLeftWing() {
        return leftWing;
    }

    class Wing {
        private String color, model;
        // статик запрещен - private static int i = 0;

        public Wing(String color, String model) {
            this.color = color;
            this.model = model;
        }

        public void excess() {
            //есть доступ к приватным полям внешнего класса
            String ex =  id;
            // можно получить сслыку на внешний класс
            Airplane air = Airplane.this;
            // можно получить ссылку на себя
            Wing wing = this;
        }
    }
}