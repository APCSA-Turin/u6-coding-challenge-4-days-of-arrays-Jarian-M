
package com.example.project;
import java.util.Arrays;
import java.util.Random;

public class Day2{
    public static String[][] nameSort(String[] names){ // your will be tested on this method
        Random ran = new Random();
        /*String[] temp1 = new String[names.length];
        for(int i = 0; i < names.length; i++) {
            int rand = ran.nextInt(names.length);
            if(!Arrays.stream(temp1).anyMatch(names[i]::equals)) {
                temp1[rand] = names[i];
            }
        } */
        String[][] niceOrNaughty = new String[1][names.length/2];
        for(int i = 0; i < names.length / 2; i++) {
            int rand = ran.nextInt(names.length);
            niceOrNaughty[0][i] = names[rand];
        }
        for(int i = 0; i < names.length / 2; i++) {
            int rand = ran.nextInt(names.length);
            if(!Arrays.stream(niceOrNaughty).anyMatch(names[rand]::equals)) {
                niceOrNaughty[1][i] = names[rand];
            }
        }
        
        return niceOrNaughty; //you must return a two dimensional string array
    }

    public static void main(String[] args) {
        String[] names = {"John", "Matt", "Lucy", "Nina", "Roxy", "Andrew", "Henry", "Donnie", "Sasha", "Mohammad", "Elsa", "Ruby"};
        String[][] result = Day2.nameSort(names);
        int nice_count = 0;
        int naughty_count = 0;
        for(int i=0; i<12; i++){
            if(result[0][i]!=null){nice_count++;}
            if(result[1][i]!=null){naughty_count++;}
        }
        System.out.println(nice_count);
        System.out.println(naughty_count);
    }
}