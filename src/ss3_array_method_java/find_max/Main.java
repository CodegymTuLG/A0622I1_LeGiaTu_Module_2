package ss3_array_method_java.find_max;

import java.util.Scanner;

public class Main {
    public static void PrintArr2(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length-1; j++) {
                System.out.print(array[i][j] + " ,");
            }
            System.out.print(array[i][array[i].length - 1]);
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        int[][] array = {
                {1, 4, 2, 9},
                {-5, 4, -9, 6},
                {10, 23, 0, 9}
        };
        PrintArr2(array);
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length-1; j++) {
                if(max < array[i][j]){
                    max = array[i][j];
                }
            }
        }
        System.out.println("Max value is: " +max);
    }

}
