package com.example.lib2;


// Make a dummy class to do arithmetic
class Arithmetic
{
    // this.__ says that its the instance variable
    int num;
    int num2;
    int result;
    public void perform()
    {
        result = num + num2;
    }
    public void perform(int l, int m)
    {
        this.result = l + m;
    }

    public Arithmetic(int a, int b)
    {
        num = a;
        num2 = b;
        /*
        This also works:
        this.num = a;
        this.num2 = b;
         */
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

        Arithmetic Obj = new Arithmetic(10,5);

        //Obj.num = 8;
        //Obj.num2 = 10;

        Obj.perform();
        System.out.println("The numbers added are " + Obj.result);
        Obj.perform(8,9);
        System.out.println("The numbers added are " + Obj.result);
    }



    private String name;
}