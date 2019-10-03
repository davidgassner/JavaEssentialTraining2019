package com.company;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        var now = LocalDateTime.now();
        var monthNumber = now.getMonthValue();

        switch (monthNumber) {
            case 1:
                System.out.println("The month is January");
                break;
            case 2:
                System.out.println("The month is February");
                break;
            case 3:
                System.out.println("The month is March");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("It's the 4th quarter");
                break;
            default:
                System.out.println("You chose another month");
        }

    }
}
