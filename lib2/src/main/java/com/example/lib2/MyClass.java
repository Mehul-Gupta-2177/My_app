package com.example.lib2;


// Make a dummy class to do arithmetic
class Arithmetic
{
    int num;
    int num2;
    int result;
    public void perform()
    {
        result = num + num2;
    }
}


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

        Arithmetic Obj = new Arithmetic();

        Obj.num = 8;
        Obj.num2 = 10;
        Obj.perform();

        System.out.println("The numbers added are " + Obj.result);
    }



    private String name;
}