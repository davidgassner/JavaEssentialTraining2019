package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        var file = new File("hello.txt");
        System.out.println("File exists: " + file.exists());

        try (FileReader reader = new FileReader(file);
             BufferedReader br = new BufferedReader(reader)) {
            var text = br.readLine();
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
