package ss6_inheritance.Circle;

public class CylinderTest {
    public static void main(String[] args){
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(6);
        System.out.println(cylinder);

        cylinder = new Cylinder("black", 8, 6);
        System.out.println(cylinder);
    }

}
