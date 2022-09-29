package ss6_inheritance.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle("red", 6.2);
        System.out.println(circle);
    }
}
