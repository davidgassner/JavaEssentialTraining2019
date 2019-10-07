package com.company;

import com.company.model.Person;

public class Main {

    public static void main(String[] args) {
        var person = new Person();
        person.setFirstName("Joe");
        person.setLastName("Smith");
        person.setAge(42);
        var output = String.format("%s %s (%d years old)",
                person.getFirstName(),
                person.getLastName(),
                person.getAge());
        System.out.println(output);
    }
}
