package ss5_accessmodifier_staticmethod_staticproperty.access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    public Circle(){

    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return this.radius*Math.PI/4;
    }

    public String getColor() {
        return color;
    }
}
