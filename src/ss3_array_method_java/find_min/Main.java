package ss3_array_method_java.find_min;

import java.util.Scanner;

public class Main {
    public static void PrintArr2(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length - 1; j++) {
                System.out.print(array[i][j] + " ,");
            }
            System.out.print(array[i][array[i].length - 1]);
            System.out.println("\n");
        }
    }

    public static int[][] InputArray2(int[][] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
            System.out.println("\n");
        }
        return array;
    }

    public static void main(String[] args) {
        int[][] array2 = new int[3][3];
        InputArray2(array2);
        PrintArr2(array2);

        int min = array2[0][0];
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                if (min > array2[i][j] ) {
                    min = array2[i][j];
                }
            }
        }
        System.out.println("Min value is: " + min);
    }

}
