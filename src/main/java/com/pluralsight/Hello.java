package com.pluralsight;

public class Hello {

    public static void main(String[] args) {

        //Call out each method
        sayHello();

        sayGoodbye();

        sayGoodMorning();

    }

    //Create all methods
    public static void sayHello() {
        System.out.println("Hello, World!");
    }

    public static void sayGoodbye() {
            System.out.println("Goodbye!");
    }

    public static void sayGoodMorning() {
        System.out.println("Good morning!");
    }

}
