package ss2_loop_java.bai_tap.print_prime_1_to_100;

public class Main {
    public static boolean checkPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Main check = new Main();
        System.out.println(2);
        for (int i = 3; i < 100; i++) {
            if (check.checkPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
