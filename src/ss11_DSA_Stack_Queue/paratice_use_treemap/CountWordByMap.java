package ss11_DSA_Stack_Queue.paratice_use_treemap;

import java.util.TreeMap;
import java.util.Scanner;


public class CountWordByMap {
    public static void main(String[] args) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        string = string.toUpperCase();
        for (int i = 0; i < string.length(); i++) {
            if (map.containsKey(string.charAt(i))) {
                int j = map.get(string.charAt(i)) + 1;
                map.put(string.charAt(i), j);
            } else {
                map.put(string.charAt(i), 1);
            }
        }
        System.out.println(map);
    }
}
