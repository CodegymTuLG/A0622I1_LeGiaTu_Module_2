package ss7_Abstract_Class_And_Interface.CircleComparator;
import ss6_Inheritance.Shape.Circle;

import java.util.Comparator;
public class CircleComparator implements Comparator<Circle>{
    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}
