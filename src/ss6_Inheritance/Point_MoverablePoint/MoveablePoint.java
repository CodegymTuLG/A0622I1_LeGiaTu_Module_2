package ss6_Inheritance.Point_MoverablePoint;

import java.util.Arrays;

public class MoveablePoint extends Point{
    float xSpeed = 0.0f;
    float ySpeed = 0.0f;
    float[] speed = new float[2];
    public MoveablePoint(float x, float y, float xSpeed,float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(){

    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float x, float y) {
        speed[0] = this.xSpeed;
        speed[1] = this.ySpeed;
    }
    public float[] getSpeed(){
        return speed;
    }
    public MoveablePoint move(){
        x += xSpeed;
        y += ySpeed;
        return this;
    }
    @Override
    public String toString() {
        return "(" +
                + super.x +
                "," +
                super.y +
                "),speed=(" + this.getXSpeed() +
                "," +
                this.getYSpeed() +
                ")";
    }
}
