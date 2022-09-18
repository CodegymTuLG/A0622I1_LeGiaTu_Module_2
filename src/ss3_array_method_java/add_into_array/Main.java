package ss3_array_method_java.add_into_array;

import java.util.Scanner;

public class Main {
    public static void PrintArr(int[] array) {
        for (int i = 0; i < array.length - 2; i++) {
            System.out.print(array[i] + " ,");
        }
        System.out.print(array[array.length - 1] + "\n");
    }

    public static void addValue(int[] array, int index, int value) {
        int stamp = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] != 0) {
                for (int j = i + 1; j > index; j--) {
                    array[j] = array[j - 1];
                }
                break;
            }
        }
        array[index] = value;
        PrintArr(array);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        System.out.println("a number");
        int number = scanner.nextInt();
        System.out.println("index");
        int index = scanner.nextInt();
        PrintArr(intArray);
        if (index < 0 || index > intArray.length) {
            System.out.println("cant be add");

        } else {
            addValue(intArray, index, number);
        }

    }

}
