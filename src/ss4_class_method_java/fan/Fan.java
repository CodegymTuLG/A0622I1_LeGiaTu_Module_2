package ss4_class_method_java.fan;

public class Fan {
    static final int slow = 1;
    static final int medium = 2;
    static final int fast = 3;
    int speed = 1;
    boolean on = false;
    double radius = 5;
    String color = "blue";

    public Fan() {

    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public static int getSlow() {
        return slow;
    }

    public static int getMedium() {
        return medium;
    }

    public static int getFast() {
        return fast;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isStatus() {
        return this.on;
    }

    public void setStatus(boolean status) {
        this.on = status;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (this.on) {
            return "speed: " + this.speed + "\n color: " + this.color + "\n  radius: " + this.radius;
        } else {
            return " color: " + this.color + " radius: " + this.radius + " fan is off ";
        }
    }
}

