
package com.example.project;
import java.util.Arrays;
import java.util.Random;

public class Day2{
    public static String[][] nameSort(String[] names){ // your will be tested on this method
        Random ran = new Random();
        
        boolean[] isNaughty = new boolean[names.length];
        for(int i = 0; i < names.length; i++) {
            isNaughty[i] = ran.nextBoolean();
        }

        String[] niceList = new String[names.length];
        String[] naughtyList = new String[names.length];

        int naughtyInd = 0;
        int niceInd = 0;
        for(int i = 0; i < names.length; i++) {
            if(isNaughty[i]) {
                naughtyList[naughtyInd] = names[i];
                naughtyInd++;
            } else {
                niceList[niceInd] = names[i];
                niceInd++;
            }
        }
        
        String[][] niceOrNaughty = new String[][] {niceList, naughtyList};
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