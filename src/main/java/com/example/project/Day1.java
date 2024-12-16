package com.example.project;
import java.util.Random;
public class Day1{
    private static String[] elf_names = {"Glitter", "Chocolate","Tiny","Snowflake","Frosty"};

    public static String generateElfName(String name){
        if(name.equals("")) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        } else {
            int num = elf_names.length;
            Random ran = new Random();
            int rand = ran.nextInt(num);
            String elf = elf_names[rand];
            return "Your elf name is: " + elf + " " + name;
        }  
    }
}