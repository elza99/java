package com.company;    //calculator for Andrei
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Enter first number");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        System.out.println("Enter second number");
        int number2 = sc.nextInt();
        System.out.println("Enter operation");
        String operation = sc.next();

        if (operation.equals("+")) {
            System.out.println(number1 + " " + "+" + " " + number2 + " = " +(number1+number2));
        }

        if (operation.equals("-")) {
            System.out.println(number1 + " " + "-" + " " + number2 + " = " +(number1-number2));
        }

        if (operation.equals("*")) {
            System.out.println(number1 + " " + "*" + " " + number2 + " = " +(number1*number2));
        }

        if (operation.equals("/")) {
            System.out.println(number1 + " " + "/" + " " + number2 + " = " +(number1/number2));
        }





    }
}
