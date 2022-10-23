package ss15_exception_debug.try_catch;

import java.util.Scanner;

public class Triangle {
    public static void checkTriangleEdges(double a, double b, double c) throws IllegalTriangleException {
        if (a + b <= c || a + c <= b || b + c <= a || a < 0 || b < 0 || c < 0) {
            throw new IllegalTriangleException("Input value is wrong!");
        } else {
            System.out.println("Input value is true ");
        }
    }

    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        double a, b, c;
        try {
            System.out.print("Enter a = ");
            a = inputValue.nextDouble();
            System.out.print("Enter b = ");
            b = inputValue.nextDouble();
            System.out.print("Enter c = ");
            c = inputValue.nextDouble();
            try {
                checkTriangleEdges(a, b, c);
            } catch (IllegalTriangleException e) {
                System.out.println("error: " + e.getMessage());
            }

        } catch (Exception exception) {
            System.out.print("error: wrong format!");
        }
    }
}
