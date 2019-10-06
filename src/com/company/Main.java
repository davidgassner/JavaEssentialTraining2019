package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        double d1, d2;
        try {
            System.out.print("Enter a numeric value: ");
            d1 = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter a numeric value: ");
            d2 = sc.nextDouble();
            sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Couldn't format as a number");
            return;
        }

        System.out.print("Select an operation (+ - * /): ");
        var operation = sc.nextLine();

        double result;
        switch (operation) {
            case "+":
                result = CalcHelper.addValues(d1, d2);
                break;
            case "-":
                result = CalcHelper.subtractValues(d1, d2);
                break;
            case "*":
                result = CalcHelper.multiplyValues(d1, d2);
                break;
            case "/":
                result = CalcHelper.divideValues(d1, d2);
                break;
            default:
                System.out.println("You didn't choose a valid operation");
                return;
        }
        System.out.println("The answer is " + result);
    }

}

