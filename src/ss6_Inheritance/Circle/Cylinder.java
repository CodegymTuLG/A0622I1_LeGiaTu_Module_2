package ss6_Inheritance.Circle;

public class Cylinder extends Circle {
    private String color = "green";
    private double radius = 5;
    private double height = 2;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(String color, double radius, double height) {
        super(color, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return 2*Math.PI*getRadius()+2*Math.PI*getRadius()*getHeight();
    }

    @Override
    public String toString() {
        return "A Cylinder with height = "
                + getHeight()
                + " and radius = "
                + getRadius()
                + " and area ="
                + getArea()
                + ", which is a subclass of "
                + super.toString();
    }
}
