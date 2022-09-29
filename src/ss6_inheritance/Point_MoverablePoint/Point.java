package ss6_inheritance.Point_MoverablePoint;

import java.util.Arrays;

public class Point {
    float x = 0.0f;
    float y = 0.0f;
    float[] xy = new float[2];
    public Point(){

    }
    public Point(float x, float y){
        this.x = y;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY() {
        xy[0] = this.x;
        xy[1] = this.y;
    }

    public float[] getXY() {
        return xy;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", xy=" + Arrays.toString(xy) +
                '}';
    }
}
