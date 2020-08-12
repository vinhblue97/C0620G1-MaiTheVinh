package abstract_class_interface.thuc_hanh.inteface_comparable;

import inherit.bai_tap.circle_cylinder.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{
    public ComparableCircle() {

    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled){
        super(radius,color,filled);
    }

    public int compareTo(ComparableCircle o){
        if(getArea()>o.getArea()) return -1;
        else if(getArea()<o.getArea()) return 1;
        else return 0;
    }


}
