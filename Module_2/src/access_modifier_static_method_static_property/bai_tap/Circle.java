package access_modifier_static_method_static_property.bai_tap;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this(1.0,"blue");
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public Circle(double r) {
        this.radius = r;
    }

    double getRadius() {
        return this.radius;
    }

    double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }
}
