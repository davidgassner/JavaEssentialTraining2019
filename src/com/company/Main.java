package com.company;

public class Main {

    public static void main(String[] args) {

        var item = "Shirt";
        var size = "M";
        var price = 14.99;
        var color = "Red";

        var template = "Clothing item: %s, size %s, color %s, $%.2f";
        var itemString = String.format(template,
                item, size, color, price);
        System.out.println(itemString);

    }
}
