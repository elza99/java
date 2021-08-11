package com.company;

import com.sun.source.tree.BinaryTree;

public class kvadrat {

    public static void main(String[] args) {

        //Есть массив чисел. Задача: выписать среднее арифметическое квадратов всех четных чисел.
        //(Если число четное возводим его в квадрат и считаем)

        //Определение четности числа реализовать с помощью метода.
        //Возведение в квадрат реализовать с помощью метода.

        //Подсказки: есть тип boolean,

        int[] points = {10, 5, 7, 8, 3, 5, 7, 5, 9, 9, 6, 10, 3, 5, 5, 7, 7, 6, 5, 8, 8, 7, 5, 9, 9, 6, 1, 4, 9, 5, 7, 5, 8, 1, 7, 9, 6, 9, 9, 9, 6, 6, 5, 5, 1, 9, 9, 2, 2, 3, 3, 4, 1, 1, 4, 3, 4};
        for (int point : points) {
            if (isEvenNumber(point)) {
                System.out.println(Math.pow(point,2)); //можно ли написать вручную формулу?
            }
            }
        }


    public static boolean isEvenNumber(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    }




