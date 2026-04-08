package ru.otus.java.basic.lesson1;

public class Application {
    /*
    комментарий
    комментарий
    комментарий
    */

    public static void main(String[] args0) {
        powerShell();
        int t;
        t = 5;
        if (t > 20) {
            // powerShell();
           //stringTest1();

        } else stringTest2();
        intTest();
    }

    public static void powerShell () {
        int a;
        a = 15;
        float b = 1.50f;
        int c = 90;
        int sum = a+c;
        System.out.println("Hello, Uliana");
        System.out.println("Uliana");
        System.out.println(a+b*8);
        int v = sum-80;
        v++;
        System.out.println(v++);
    }
    public static void stringTest1 () {
        System.out.println("Сегодня на улице лето");

    }
    public static void stringTest2 () {
       System.out.println("Сегодня на улице зима");

    }
    public static void intTest () {
        float p;
        int a,b;
        a = 5;
        b = 8;
        int sum = a+b;
        System.out.println(sum);
    }


}
