package ss10_DSA.arraylist;

import java.util.Arrays;

public class MyListTest {
    public static void showArray(MyList<Integer> a) {
        if (a.getSize() > 0) {
            for (int i = 0; i < a.getSize() - 2; i++) {
                System.out.print(a.getElements()[i] + " ,");
            }
            System.out.print(a.getElements()[a.getSize() - 1]);
            System.out.println();
        } else {
            System.out.println("Array is not exists");
        }

    }
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        //make list by add method
        listInteger.add(15);
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(5);
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        System.out.println("1.add have index");
        System.out.println("add before");
        showArray(listInteger);
        listInteger.add(3, 0);
        System.out.println("add after");
        showArray(listInteger);
        System.out.println("2.delete");
        System.out.println("before remove");
        showArray(listInteger);
        System.out.println("Remove value is: " + listInteger.remove(6));
        System.out.println("after remove");
        showArray(listInteger);
        System.out.println("add function");
        System.out.println("3.print size of array");
        System.out.println("size is " + listInteger.getSize());
        System.out.println("4.Clone array list");
        System.out.println(listInteger.cloneArraylist());
        MyList<Integer> cloneArray = listInteger.cloneArraylist();
        showArray(cloneArray);
        System.out.println("arrray main");
        listInteger.add(3, 0);
        showArray(listInteger);
        System.out.println("arrray child");
        showArray(cloneArray);
        System.out.println(listInteger.get(4));
        listInteger.clear();
        showArray(listInteger);
    }
}
