package com.company;

import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int firstNumber = sc.nextInt();
            char action = sc.next().charAt(0);
            int secondNumber = sc.nextInt();
            if (action == '+') {
                writeSumToConsole(firstNumber,secondNumber);

            } else if (action == '-') {

                System.out.println(countDifference(firstNumber,secondNumber));
            } else if (action == '/') {

                System.out.println(firstNumber / secondNumber);
            } else if (action == '*') {

                System.out.println(firstNumber * secondNumber);
            } else {
                System.out.println("Error");
            }
        }
    }
    static void writeSumToConsole(int a, int b) {
        System.out.println(a + b);
    }
    static int countDifference(int a, int b) {
        return a - b;
    }
}









