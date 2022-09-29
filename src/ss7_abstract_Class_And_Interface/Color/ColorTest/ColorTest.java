package ss7_abstract_Class_And_Interface.Color.ColorTest;

import ss7_abstract_Class_And_Interface.Color.colorable.Shape;
import ss7_abstract_Class_And_Interface.Color.colorable.Square;

public class ColorTest {
    public static void main(String[] args) {
        int i = 0;
        Shape[] squares = new Shape[3];
        squares[0] = new Square(2, "green", true);
        squares[1] = new Square(3, "blue", false);
        squares[2] = new Square(4, "black", true);

        for (Shape s : squares) {
            i++;
            System.out.println("square " + i + " have color is " + s.howToColor());
        }
    }
}
