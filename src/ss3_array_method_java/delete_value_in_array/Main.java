package ss3_array_method_java.delete_value_in_array;

import java.util.Scanner;

public class Main {
    public static void PrintArr(int[] array) {
        for (int i = 0; i < array.length - 2; i++) {
            System.out.print(array[i] + " ,");
        }
        System.out.print(array[array.length - 1] + "\n");
    }

    public static void Pop(int[] array) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int indexDel = 0;
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                indexDel = i;
            }
        }
        for (int i = indexDel; i < array.length-2; i++) {
            array[i] = array[i + 1];
        }

        array[array.length - 1] = 0;
        PrintArr(array);
    }

    public static void main(String[] args) {
        int[] intArray = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        PrintArr(intArray);
        Pop(intArray);
    }

}
