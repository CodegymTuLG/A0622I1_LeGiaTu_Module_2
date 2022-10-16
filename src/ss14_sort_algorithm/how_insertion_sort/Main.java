package ss14_sort_algorithm.how_insertion_sort;

public class Main {
    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){ //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            System.out.println("x = array["+i+"], pos = "+i);
            System.out.println("Xét điều kiện pos > 0 && x < array[pos-1] ?");
            while(pos > 0 && x < array[pos-1]){
                System.out.println("Thực hiện đổi chỗ");
                System.out.println("array[pos] = array[pos-1] (array["+pos+"] = array["+(pos-1)+"])");
                array[pos] = array[pos-1]; // đổi chỗ
                pos--;
            }
            System.out.println("gán array[pos] = x (array["+pos+"] = "+x+")");
            array[pos] = x;
        }
    }

    public static void main(String[] args) {
        int[] array = {6,5,5,6,9};
        System.out.println("Bắt đầu sắp xếp chuỗi ");
        System.out.println("Với pos là vị trí chèn và x là phần từ lấy ra so sánh");
        insertionSort(array);
        System.out.println("array sau khi đã sắp xếp chèn:");
        for(int ar: array){
            System.out.print(ar+ " ");
        }
    }
}
