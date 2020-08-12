package abstract_class_interface.bai_tap.interface_colorable;

import inherit.thuc_hanh.Square;
import inherit.thuc_hanh.Rectangle;
import inherit.thuc_hanh.Circle;
import inherit.thuc_hanh.Shape;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle();
        shapes[1] = new Circle();
        shapes[2] = new Square();
        System.out.println("Result:");
        for (Shape shape : shapes) {
            shape.howToColor();
        }

    }
}
