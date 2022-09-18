package ss2_loop_java.bai_tap.print_image;

import java.util.Scanner;

public class Main {
    public void Rectangle() {
        System.out.println("Draw the rectangle");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public void TopLeft() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public void TopRight() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (j >= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    public void BottomLeft() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public void BottomRight() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j <= 4; j++) {
                if (j < 5 - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
    }

    public void IsoscelesTriangle() {
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j <= 8-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 4) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    Main rectangle = new Main();
                    rectangle.Rectangle();
                    break;
                case 2:
                    int choiceTriangle = -1;
                    System.out.println("Draw the square triangle");
                    while (choiceTriangle != 5) {
                        System.out.println("1. top-left square triangle");
                        System.out.println("2. top-right square triangle");
                        System.out.println("3. bottom-left square triangle");
                        System.out.println("4. bottom-right square triangle");
                        System.out.println("5. Exit");
                        System.out.println("Enter your choice: ");
                        choiceTriangle = input.nextInt();
                        switch (choiceTriangle) {
                            case 1:
                                Main topLeft = new Main();
                                topLeft.TopLeft();
                                break;
                            case 2:
                                Main topRight = new Main();
                                topRight.TopRight();
                                break;
                            case 3:
                                Main bottomLeft = new Main();
                                bottomLeft.BottomLeft();
                                break;
                            case 4:
                                Main bottomRight = new Main();
                                bottomRight.BottomRight();
                                break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Draw isosceles triangle");
                    Main isoscelesTriangle = new Main();
                    isoscelesTriangle.IsoscelesTriangle();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
        ;


    }
}
