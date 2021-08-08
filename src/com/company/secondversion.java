package com.company;

import java.util.Scanner;

public class secondversion {


        public static void main(String[] args) {

            //Создать массив оценок, которые будут соответствовать набранным баллам по приниципу 100-90 'A', 89-80 'B', 79-70 'C',
            //69-60 'D', 59-50 'E', 49-0 'F'

            //Выписать процентное количество каждой из оценок
            Scanner skanner = new Scanner(System.in);
            int mark = skanner.nextInt();

            int[] points = {100, 0, 50, 70, 80, 35, 75, 99, 60, 100, 30, 55, 77, 65, 88, 75, 99, 60, 1, 49, 50, 75, 81, 79, 69, 99, 60, 60, 50, 51, 99, 22, 33, 41, 14, 34};
            for (int i = 0; i < points.length; i++) {
            }
            System.out.println(mark);
        }
    }
