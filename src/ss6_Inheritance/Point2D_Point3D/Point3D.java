package ss6_Inheritance.Point2D_Point3D;

public class Point3D extends Point2D {
    float z = 0.0f;
float[] xyz = new float[3];
    public Point3D() {

    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }


    public void setXYZ(float x, float y, float z) {
        xyz[0] = this.x;
        xyz[1] = this.y;
        xyz[2] = this.z;
    }

    public float[] getXY() {
        return xy;
    }

    @Override
    public String toString() {
        return "(" +
                x +
                ","+
                y +
                ","+
                z +
                ")"+
                ", which is a subclass of "+
                super.toString();
    }
}
