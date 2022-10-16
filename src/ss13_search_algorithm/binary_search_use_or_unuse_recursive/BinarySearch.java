package ss13_search_algorithm.binary_search_use_or_unuse_recursive;

public class BinarySearch {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
    static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -1;
    }

    static int binarySearchRecursive(int[] list, int key, int left, int right) {
        if (left > right) return -1;
        int mid = (left + right)/2;
        if (list[mid] == key) return mid;
        if (list[mid] > key) {
            return binarySearchRecursive(list, key, left, mid - 1);
        } else {
            return binarySearchRecursive(list, key, mid + 1, right);
        }
    }

    public static void main(String[] args) {
        System.out.println(binarySearchRecursive(list, 2, 0, 12));
        System.out.println(binarySearchRecursive(list, 11, 0, 12));
        System.out.println(binarySearch(list, 79));
        System.out.println(binarySearch(list, 1));
        System.out.println(binarySearch(list, 5));
        System.out.println(binarySearch(list, 80));
    }
}
