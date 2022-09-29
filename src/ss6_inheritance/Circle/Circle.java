package ss6_inheritance.Circle;

public class Circle {
    private String color = "green";
    private double radius = 5;

    public Circle() {
    }

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "A Circle with color of "
                + getColor()
                + " and raidius "
                + getRadius()  ;
    }
}
