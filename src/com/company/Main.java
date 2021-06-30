package com.company;
import java.util.Scanner;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

        out.println("Enter the first number: ");
        String number1Str = scanner.next();
        Integer number1 = parseIntOrNull(number1Str);
        if (number1 == null)
        {
            out.println("Incorrect number");
            return;
        }

        out.println("Enter the second number: ");
        String number2Str = scanner.next();
        Integer number2 = parseIntOrNull(number2Str);
        if (number2 == null)
        {
            out.println("Incorrect number");
            return;
        }

        out.println("Enter operation: ");

        String str = scanner.next();
        if (str.length() != 1) {
            out.println("Incorrect operation");
            return;
        }

        Character operation = str.charAt(0);
        if (operation == '+') {
            out.println(number1 + " " + operation + " " + number2 + " = " + (number1 + number2));
        } else if (operation == '-') {
            out.println(number1 + " " + operation + " " + number2 + " = " + (number1 - number2));
        } else if (operation == '/') {
            if (number2 == 0)
            {
                out.println("/ by zero is forbidden in this world");
                return;
            }
            out.println(number1 + " " + operation + " " + number2 + " = " + (number1 / number2));
        } else if (operation == '*') {
            out.println(number1 + " " + operation + " " + number2 + " = " + (number1 * number2));
        } else {
            out.println("Incorrect operation");
        }
    }

    public static Integer parseIntOrNull(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
