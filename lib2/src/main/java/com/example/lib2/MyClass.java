package com.example.lib2;

public class MyClass {
    public static void main(String[] args) {

        // prints out the name
        String name = "My name is Mehul";
        System.out.println(name);
        System.out.print("\n");
        // for loop to print out a stair of stars
        for (int i = 0; i < 10; i++){
            for (int k = 0; k < i ; k++){
                System.out.print("*");
            }
            System.out.print("\n");

        }
    }

    private String name;
}