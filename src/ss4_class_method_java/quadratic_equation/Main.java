package ss4_class_method_java.quadratic_equation;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Enter a,b,c:");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if(quadraticEquation.getDiscriminant() >0){
            System.out.println("The equation has two roots " + quadraticEquation.getRoot1() + " and " + quadraticEquation.getRoot2());
        }else if(quadraticEquation.getDiscriminant() == 0){
            System.out.println("The equation has one root " + quadraticEquation.getRoot1());
        }else {
            System.out.println("The equation has no roots");
        }
    }
}
