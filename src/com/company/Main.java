package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 10 + 12;
        String answer = "The answer is " + result;
        System.out.println(answer);

        String mString = "This is an int converted to a string: " + 35;
        System.out.println(mString);

        double mDouble = 654.489;
        var doubleTostring = Double.toString(mDouble);

        var res = "Converting to a string again " + doubleTostring;
        System.out.println(res);
      }
}
