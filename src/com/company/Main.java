package com.company;

import com.company.model.ClothingItem;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {

        var item = new ClothingItem("Shirt", "M", 19.99, 3);

        var totalPrice = item.getPrice() * item.getQuantity();
        var formatter = NumberFormat.getCurrencyInstance();
        var output = String.format("Your %s order will cost %s",
                item.getType(),
                formatter.format(totalPrice));
        System.out.println(output);
    }
}