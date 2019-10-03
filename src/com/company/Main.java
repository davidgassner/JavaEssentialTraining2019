package com.company;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        var now = LocalDateTime.now();
        var monthNumber = now.getMonthValue();

    }
}
