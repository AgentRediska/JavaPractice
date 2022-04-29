package com.company.string_intern;

public class Main {

    public static void main(String[] args) {
        String str1 = "Denis";
        String str2 = "Denis";
        String str3 = "Den" + "is";
        String s = "is";
        String str4 = "Den" + s;
        String str5 = new String("Denis");
        String str6 = new String("Denis");
        String str7 = (new String("Denis")).intern();


        //1)
        System.out.println("Строка 1 и строка 2 равны?");
        System.out.println("Результат сравнения: " + (str1 == str2)
                + ". hash code " + str1.hashCode() + " | " + str2.hashCode());
        //2)
        System.out.println("Строка 1 и строка 3 равны?");
        System.out.println("Результат сравнения: " + (str1 == str3)
                + ". hash code " + str1.hashCode() + " | " + str3.hashCode());

        //3)
        System.out.println("Строка 1 и строка 4 равны?");
        System.out.println("Результат сравнения: " + (str1 == str4)
                + ". hash code " + str1.hashCode() + " | " + str4.hashCode());

        //4)
        System.out.println("Строка 1 и строка 5 равны?");
        System.out.println("Результат сравнения: " + (str1 == str5)
                + ". hash code " + str1.hashCode() + " | " + str5.hashCode());

        //5)
        System.out.println("Строка 5 и строка 6 равны?");
        System.out.println("Результат сравнения: " + (str5 == str6)
                + ". hash code " + str5.hashCode() + " | " + str6.hashCode());

        //6)
        System.out.println("Строка 1 и строка 7 равны?");
        System.out.println("Результат сравнения: " + (str1 == str7)
                + ". hash code " + str1.hashCode() + " | " + str7.hashCode());
    }
}
