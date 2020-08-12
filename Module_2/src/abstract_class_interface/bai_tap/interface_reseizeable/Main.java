package abstract_class_interface.bai_tap.interface_reseizeable;

import inherit.thuc_hanh.Circle;
import inherit.thuc_hanh.Rectangle;
import inherit.thuc_hanh.Shape;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();

        double percent = Math.round(Math.random() * 99 + 1);
        for (Shape shape : shapes) {
            shape.resize(percent);
            System.out.println(shape.toString());
        }
    }
}
