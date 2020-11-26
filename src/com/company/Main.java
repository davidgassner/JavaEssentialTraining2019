package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 10 + 12;
        String answer = "The answer is " + result;
        System.out.println(answer);

        double dec = 100.8787;
        String double_dec = Double.toString(dec);
        System.out.println(double_dec);

        int a = 15;
        String int_a = Integer.toString(a);
        System.out.println(int_a);

        long b = 109999999;
        String long_b = Long.toString(b);
        System.out.println(long_b);
    }
}
