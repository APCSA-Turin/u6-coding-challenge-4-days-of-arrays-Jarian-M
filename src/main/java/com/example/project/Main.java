package com.example.project;

public class Main {
    public static void main(String[] args) {
        String name1 = "Nina";
        String elfName1 = Day1.generateElfName(name1);
        System.out.println(elfName1);

        String name2 = "Joe";
        String elfName2 = Day1.generateElfName(name2);
        System.out.println(elfName2);

        String name3 = "";
        String elfName3 = Day1.generateElfName(name3);
        System.out.println(elfName3);
    }
}
