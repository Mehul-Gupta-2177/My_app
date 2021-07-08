package com.example.lib2;


/*
Inner classes: 3 basic types
1. Member Class
2.Static Class
3. Anonymous class

 */

// Make a dummy class to do arithmetic
class Arithmetic
{
    // this.__ says that its the instance variable
    int num;
    int num2;
    int result;
    // multiple methods with same name should have different parametres
    // also called Method Overloading
    public void perform()
    {
        result = num + num2;
    }
    public void perform(int l, int m)
    {
        this.result = l + m;
    }

    // multiple constructors with same name should have different parameters
    // to do Constructor Overloading
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
    // inner class
    class arith_inner
    {
       int num3;

       public void num3_val(){
           System.out.println(num3);
       }
    }
    // making a static class
    static class  arith_inner_stat
    {
        int num4;

        public void num4_val(){
            System.out.println(num4);
        }
    }
    // example to pass a i num of parameters
    public static int add(int ... i) // variable length args
    {
        int sum = 0;
        for(int n : i)
        {
            sum = sum + n;
        }
        return sum;
    }
}


public class MyClass {

    static int k = 20;
    public static void main(String[] args) {
        System.out.println(k);
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

        //Example of Inner Class workings
        Arithmetic.arith_inner Obj1 = Obj.new arith_inner();
        Obj1.num3 = 10;
        Obj1.num3_val();
        //Example of static Inner Class workings
        Arithmetic.arith_inner_stat Obj2 = new Arithmetic.arith_inner_stat();
        Obj2.num4 = 150;
        Obj2.num4_val();

        // arrays examples
        // 1D array
        System.out.print("\n");
        int numbers[] = new int[3];
        numbers[0] = 2;
        numbers[1] = 8;
        numbers[2] = 98;
        // enhanced for loop for a local array
        for(int i : numbers){
            System.out.println(i);

        }
        // ROW, COLUMN -> height,width
        // 2d array
        // if number of columns are not fixed its called jagged arrays
        int numbers_2d[][] = {
                                {1, 2, 3, 4},
                                {5, 6, 7, 8}
                              };
        System.out.println((numbers_2d[0][1]));

        System.out.print("\n");


        // enhanced for loop test
        System.out.println(Arithmetic.add(1, 2, 3, 4, 5, 6, 7));
    }

}