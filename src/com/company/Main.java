package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        System.out.print("Enter a numeric value: ");
        var d1 = sc.nextDouble();

        System.out.print("Enter a numeric value: ");
        var d2 = sc.nextDouble();

        double result = d1 / d2;

        System.out.println("The answer is " + result);
    }

}

