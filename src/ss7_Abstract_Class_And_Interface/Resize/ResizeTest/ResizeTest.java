package ss7_Abstract_Class_And_Interface.Resize.ResizeTest;

import ss7_Abstract_Class_And_Interface.Resize.resizeable.*;

public class ResizeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0]  = new Circle(5,"yellow",false);
        shapes[1]  = new Rectangle(10,7,"blue",true);
        shapes[2]  = new Square(9,"black",true);
        System.out.println("before resize");
        for(Shape image : shapes){
            System.out.println(image);
        }
        System.out.println("after resize");
        for(Shape image : shapes){
            image.resize(5);
            System.out.println(image);
        }
    }


}
