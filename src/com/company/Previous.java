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
        for (int i = 0; i < c.length; i++) {
            switch (anything.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'y':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'Y':
                    System.out.print(" " + anything.charAt(i));
            }

        }
    }
}
