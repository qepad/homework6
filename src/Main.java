public class Main {
    public static void main(String[] args) {

        // task 1

        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }


        // task 2

        System.out.println("Задача 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }


        // task 3

        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }


        // task 4

        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }


        // task 5

        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }


        // task 6

        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }


        // task 7

        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }


        // task 8

        System.out.println("Задача 8");
        int savings = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + savings;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }


        // task 9

        System.out.println("Задача 9");
        savings = 29000;
        float total2 = 0F;
        for (int i = 1; i <= 12; i++) {
            total2 = total2 + total2 / 100;
            total2 = total2 + savings;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total2 + " рублей");
        }


        // task 10

        System.out.println("Задача 10");
        for (int i = 1; i <= 10; i++) {
            var result = 2 * i;
            System.out.println("2 * " + i + " = " + result);
        }


    }
}