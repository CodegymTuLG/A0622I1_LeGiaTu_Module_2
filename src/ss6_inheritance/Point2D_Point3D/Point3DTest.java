package ss6_inheritance.Point2D_Point3D;

public class Point3DTest {
    public static void main(String[] args){
        Point3D point3d = new Point3D();
        System.out.println(point3d);

        point3d = new Point3D(5.3f);
        System.out.println(point3d);

        point3d = new Point3D(9.3f,20.8f,65.3f);
        System.out.println(point3d);
    }
}
