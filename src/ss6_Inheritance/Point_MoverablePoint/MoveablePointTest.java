package ss6_Inheritance.Point_MoverablePoint;

public class MoveablePointTest {
    public static void main(String[] args) {
        MoveablePoint point = new MoveablePoint(4,2,50,30);
        System.out.println(point.toString());
        System.out.println(point.move());
    }
}
