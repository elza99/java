package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Homework {

    public static void main(String[] args) {
        System.out.println("Tell me the array's length");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int array[] =new int[size];
        System.out.println("Insert array elements");
        for(int a = 0;a<size;a++) {
            array[a] = input.nextInt();
        }
        System.out.println("Inserted array elements");
        for(int a=0;a<size;a++) {
            System.out.println(" " + array [a]);
        }
        System.out.println();
        int max = Arrays.stream(array).max().orElse(0);
        System.out.println(max);
        }

    }



