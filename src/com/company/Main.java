package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Object ArrayList;

    public static void main(String[] args) {

        //Создать массив оценок, которые будут соответствовать набранным баллам по приниципу 100-90 'A', 89-80 'B', 79-70 'C',
        //69-60 'D', 59-50 'E', 49-0 'F'

        //Выписать процентное количество каждой из оценок
        ArrayList <Integer> agroup = new ArrayList<Integer>();
        ArrayList <Integer> bgroup = new ArrayList<Integer>();
        ArrayList <Integer> cgroup = new ArrayList<Integer>();
        ArrayList <Integer> dgroup = new ArrayList<Integer>();
        ArrayList <Integer> egroup = new ArrayList<Integer>();
        ArrayList <Integer> fgroup = new ArrayList<Integer>();
        int[] points = {100, 0, 50, 70, 80, 35, 75, 99, 60, 100, 30, 55, 77, 65, 88, 75, 99, 60, 1, 49, 50, 75, 81, 79, 69, 99, 60, 60, 50, 51, 99, 22, 33, 41, 14, 34};
        for (int i = 0; i < points.length; i++) {
            var value = points[i];
            if (value >= 90 && points[i] <= 100) {
                agroup.add(value);
            }
            System.out.println("A");
            if (value >= 80 && points[i] <= 89) {
                bgroup.add(value);
            }
            System.out.println("B");
            if(value>=70 && points[i]<=79) {
                cgroup.add(value);
            }
            System.out.println("C");
            if(value>=60 && points[i] <=69) {
                dgroup.add(value);
            }
            System.out.println("D");
            if(value>=50 && points[i]<=59) {
                egroup.add(value);}
            System.out.println("E");
            if(value>=0 && points[i]<=49) {
                fgroup.add(value);        }
            System.out.println("F");
        }
        System.out.println(100*agroup.stream().count()/points.length);
        System.out.println(100*bgroup.stream().count()/points.length);
        System.out.println(100*cgroup.stream().count()/points.length);
        System.out.println(100*dgroup.stream().count()/points.length);
        System.out.println(100*egroup.stream().count()/points.length);
        System.out.println(100*fgroup.stream().count()/points.length);


    }
}
