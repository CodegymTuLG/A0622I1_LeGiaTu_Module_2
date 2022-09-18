package ss1_introduction_to_java.bai_tap.show;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("enter your name \n");
        String name = scanner.nextLine();
        System.out.printf("Hello " + name);
    }
}
