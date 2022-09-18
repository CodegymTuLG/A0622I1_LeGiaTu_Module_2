package ss2_loop_java.bai_tap.check_prime;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("input size of list prime");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int count = 0;
        int n = 2;
        while (count < size) {
            boolean isPrime = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(n);
                count++;
            }
            n++;
        }
    }
}
