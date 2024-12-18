package com.example.project;

public class Day3 {
      public static String[][] generateSnowflake(int size) { //you will be tested on this method
        if(size % 2 == 0) {
          throw new IllegalArgumentException("size must be odd");
        }

        String[][] grid = new String[size][size];
        for(int i = 0; i < size; i++) {
          for(int j = 0; j < size; j++) {
            grid[i][j] = " ";
          }
        }

        int center = size / 2;
        for(int j = 0; j < size; j++) {
          grid[j][center] = "*";
          grid[center][j] = "*";
        }

        for(int k = 0; k < size; k++) {
          grid[k][k] = "*";
          grid[k][size - 1 - k] = "*";
        }
        
        return grid;
    }

    // Prints the snowflake  will be useful if tests fail (you will not be tested on this method)
    public static void printSnowflake(String[][] snowflake) {
      System.out.println(snowflake);
    }

    // Test for the snowflake generation
    public static void main(String[] args) {
      int size = 5; // Small odd size
      String[][] snowflake = Day3.generateSnowflake(size);
      printSnowflake(snowflake);
    }
}
