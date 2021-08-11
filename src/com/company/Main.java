package com.company;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Object ArrayList;

    public static void main(String[] args) {

        //Создать массив оценок, которые будут соответствовать набранным баллам по приниципу 100-90 'A', 89-80 'B', 79-70 'C',
        //69-60 'D', 59-50 'E', 49-0 'F'

        //Выписать процентное количество каждой из оценок
        int[] points = {100, 0, 50, 70, 80, 35, 75, 99, 60, 100, 30, 55, 77, 65, 88, 75, 99, 60, 1, 49, 50, 75, 81, 79, 69, 99, 60, 60, 50, 51, 99, 22, 33, 41, 14, 34};
        int counterA = 0;
        int counterB = 0;
        int counterC = 0;
        int counterD = 0;
        int counterE = 0;
        int counterF = 0;
        for (int i = 0; i < points.length; i++) {
            int value = points[i];                        // foreach?, но не сможем изменять элементы?
            if (value >= 90) { //
                counterA++;
            } else if (value >= 80) {
                counterB++;
            } else if (value >= 70) {
                counterC++;
            } else if (value >= 60) {
                counterD++;
            } else if (value >= 50) {
                counterE++;
            } else {
                counterF++;
            }
        }
        System.out.println("A - " + round(percentage(points.length, counterA), 2) + "%");
        System.out.println("B - " + round(percentage(points.length, counterB), 2) + "%");
        System.out.println("C - " + round(percentage(points.length, counterC), 2) + "%");
        System.out.println("D - " + round(percentage(points.length, counterD), 2) + "%");
        System.out.println("E - " + round(percentage(points.length, counterE), 2) + "%");
        System.out.println("F - " + round(percentage(points.length, counterF), 2) + "%");


    }

    static double percentage(int hundredPercent, int number) {
        return (number * 100.0) / hundredPercent;

    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }



