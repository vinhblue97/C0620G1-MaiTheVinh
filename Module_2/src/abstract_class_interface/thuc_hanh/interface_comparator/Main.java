package abstract_class_interface.thuc_hanh.interface_comparator;

import inherit.bai_tap.circle_cylinder.Circle;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Circle[] circles = new Circle[3];
        circles[0] = new Circle();
        circles[1] = new Circle(1.5,"red",false);
        circles[2] = new Circle(5.5,"yellow",true);

        System.out.println("Pre-sort");
        for (Circle circle:circles){
            System.out.println(circle);
        }

        CircleComparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sort");
        for (Circle circle:circles){
            System.out.println(circle);
        }
    }
}
