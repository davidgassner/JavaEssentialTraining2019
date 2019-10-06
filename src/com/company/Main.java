package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        var file = new File("hello.txt");
        System.out.println("File exists: " + file.exists());
    }

}
