
package com.example.project;
import java.util.Random;

public class Day2{
    public static String[][] nameSort(String[] names){ // your will be tested on this method
        Random ran = new Random();
        int num1 = 0;
        int num2 = 0;
        String[] temp1 = new String[names.length];
        String[] temp2 = new String[names.length];
        for(int i = 0; i < names.length; i++) {
            int rand = ran.nextInt(2);
            if(rand == 1) {
                num1++;
                temp1[i] = names[i];
            } else {
                num2++;
                temp2[i] = names[i];
            }
        }
        String[] nice = new String[num1];
        int niceTemp = 0;
        for(int i = 0; i < temp1.length; i++) {
            if(temp1 != null) {
                nice[niceTemp] = temp1[i];
                niceTemp++;
            }
        }
        String[] naughty = new String[num2];
        int naughtyTemp = 0;
        for(int i = 0; i < temp2.length; i++) {
            if(temp2 != null) {
                naughty[naughtyTemp] = temp2[i];
                naughtyTemp++;
            }
        }
        String[][] arr = new String[nice][naughty];

        // Printing the Array
        for (int i = 0; i < nice.length; i++){
            for (int j = 0; j < naughty.length; j++)
                System.out.print(arr[i][j]+" ");
                System.out.println();
            }
        }   
        return arr; //you must return a two dimensional string array
    }

    public static void main(String[] args) {

    }
}