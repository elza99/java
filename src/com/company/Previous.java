package com.company;
import javax.imageio.spi.ImageInputStreamSpi;
import javax.swing.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.atomic.AtomicIntegerArray;

import static java.lang.Math.max;

public class Previous {

    private static Object ArrayList;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter anything");
        String anything = sc.nextLine();
        String[] c = anything.split(" ");
        int max = (int) Double.MIN_VALUE; // присваиваем переменной max мин значение,
        for (int i = 0; i < c.length; i++) { // проходимся по списку
            max = Math.max(max, Integer.parseInt(c[i])); // c помощью метода Math.max сравниваем значение
            // max и текущий элемент???Спросить




        }
        System.out.println("The biggest number is " + " " + max);

            }

        }


