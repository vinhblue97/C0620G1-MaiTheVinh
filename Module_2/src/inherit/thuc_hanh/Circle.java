package inherit.thuc_hanh;
import abstract_class_interface.bai_tap.interface_colorable.Colorable;
public class Circle extends Shape implements Colorable {
    private double radius;


    public Circle() {
        this.radius = 1.0;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    public double getPerimeter() {
        return 2 * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius = " + this.radius + ", which is a subclass of " + super.toString();
    }

    @Override
    public void howToColor() {

    }
}
