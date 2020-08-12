package abstract_class_interface.thuc_hanh.interface_comparator;

import inherit.bai_tap.circle_cylinder.Circle;

import java.util.Comparator;

public class CircleComparator extends Circle implements Comparator<Circle> {

    public CircleComparator() {

    }

    public CircleComparator(double radius) {
        super(radius);

    }

    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getArea() > c2.getArea()) return 1;
        else if (c1.getArea() < c2.getArea()) return -1;
        else return 0;

    }
}
