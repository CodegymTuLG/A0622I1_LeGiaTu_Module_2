package ss5_accessmodifier_staticmethod_staticproperty.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5.2, "blue");
        Circle circle3 = new Circle(2.5, "black");
        System.out.println("Circle 1 have radius1 is " + circle1.getRadius() + " and color is " + circle1.getColor() + "\nArea is " + circle1.getArea());
        System.out.println("Circle 2 have radius2 is " + circle2.getRadius() + " and color is " + circle2.getColor() + "\nArea is " + circle2.getArea());
        System.out.println("Circle 3 have radius3 is " + circle3.getRadius() + " and color is " + circle3.getColor() + "\nArea is " + circle3.getArea());
    }
}
