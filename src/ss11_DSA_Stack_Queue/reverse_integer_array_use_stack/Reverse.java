package ss11_DSA_Stack_Queue.reverse_integer_array_use_stack;

import java.util.Stack;
import java.util.Scanner;

public class Reverse<E> {
    public static void main(String[] args) {
        Stack<Integer> wStack = new Stack();
        String outp = "";
        Scanner scanner = new Scanner(System.in);
        String mWord = scanner.next();
        for (int i = 0; i < mWord.length(); i++) {
            wStack.push(Integer.parseInt(String.valueOf(mWord.charAt(i))));
        }
        System.out.print("outp is ");
        while (!wStack.isEmpty()) {
            outp += wStack.pop() + " ";
        }
        System.out.print(outp);
    }
}
