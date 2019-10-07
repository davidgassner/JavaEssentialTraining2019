package com.company;

import com.company.model.ClothingItem;
import com.company.model.ClothingSize;
import com.company.model.Hat;
import com.company.model.Shirt;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, ClothingItem> items = new HashMap<>();
        items.put("shirt", new Shirt(
                ClothingSize.L,
                19.99,
                3));
        items.put("hat", new Hat(
                ClothingSize.M,
                29.99,
                1));

//        var anItem = items.get("hat");
//        displayItemDetails(anItem);
//
        var keys = items.keySet();
        for (String key : keys) {
            var item = items.get(key);
            displayItemDetails(item);
        }
    }

    private static void displayItemDetails(ClothingItem item) {
        var totalPrice = item.getPrice() * item.getQuantity();
        var formatter = NumberFormat.getCurrencyInstance();
        var output = String.format("Your %s %s order will cost %s",
                item.getSize(),
                item.getType(),
                formatter.format(totalPrice));
        System.out.println(output);
    }
}