package com.kelaniya.unit;

public class helloworld {

    public static void main(String[] args) {
        System.out.println("hello world");

        Scanner scanner = new (System.in);
        System.out.println("Enter the first number");

        double firstnum = scanner.nextdouble();

        System.out.println("Enter the second number");
        double secondnum = scanner.nextdouble();

        double answer = firstnum + secondnum ;
        System.out.println("sum is =" + answer);




    }

}

