package ss14_sort_algorithm.make_insertionSort_method;

public class insertionSort {
    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos] = x;
        }
    }

    public static void main(String[] args) {
        int[] array = {6,5,5,6,9,43,253,32,23,44324,43,56,67,78,78,87,78,7,6,5,54,545,3-5,-6,5,25,-5,-4,2,-3,2-5,2,5,25};
        System.out.println("before:");
        for(int ar: array){
            System.out.print(ar+ " ");
        }
        System.out.println();
        insertionSort(array);
        System.out.println("after");
        for(int ar: array){
            System.out.print(ar+ " ");
        }
    }
}
