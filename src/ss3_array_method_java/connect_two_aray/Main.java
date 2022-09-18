package ss3_array_method_java.connect_two_aray;

import java.util.Scanner;

public class Main {
    public static void PrintArr(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " ,");
        }
        System.out.print(array[array.length - 1] + "\n");
    }

    public static int[] concatArray(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0; i <= array1.length - 1; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i <= array2.length - 1; i++) {
            array3[array1.length + i] = array2[i];
        }
        return array3;
    }

    public static int[] InputArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            int inputNum = scanner.nextInt();
            array[i] = inputNum;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] intArray1 = new int[3];
        int[] intArray2 = new int[3];
        InputArray(intArray1);
        PrintArr(intArray1);
        InputArray(intArray2);
        PrintArr(intArray1);
        PrintArr(concatArray(intArray1, intArray2));

    }

}
