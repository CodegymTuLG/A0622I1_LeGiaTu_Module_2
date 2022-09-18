package ss4_class_method_java.stop_watch;

import java.util.Scanner;
public class Main {


    public static void PrintArr(int[] array) {
        for (int i = 0; i < array.length - 2; i++) {
            System.out.print(array[i] + " ,");
        }
        System.out.print(array[array.length - 1] + "\n");
    }

    public static void main(String[] args) {
        StopWatch performanceFunc = new StopWatch();
        performanceFunc.getStartTime();
        performanceFunc.start();
        int temp = 0;
        // order by desc
        int[] array = {2,5,8,5,8,25,8,5,85,85,85,85,85,85,8,58,58,5,25,2,2,54,5,95,65,65,65,6};
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++) {
                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    PrintArr(array);
        performanceFunc.getEndTime();
        performanceFunc.stop();
        System.out.println(performanceFunc.getElapsedTime()+" milisecond");

    }

}
