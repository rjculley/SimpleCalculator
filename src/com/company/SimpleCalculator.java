package com.company;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        int num1;
        int num2;
        String operation;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        num1 = input.nextInt();

        System.out.println("Enter second number: ");
        num2 = input.nextInt();

        Scanner op = new Scanner(System.in);

        System.out.println("Enter operation: + - * /");
        operation = op.next();

        if (operation.equals("+"))
        {
            System.out.println("your answer is: " + (num1 + num2));
        }
        if (operation.equals("-"))
        {
            System.out.println("your answer is: " + (num1 - num2));
        }
        if (operation.equals("/"))
        {
            System.out.println("your answer is: " + (num1 / num2));
        }
        if (operation .equals( "*"))
        {
            System.out.println("your answer is: " + (num1 * num2));
        }

    }
}
