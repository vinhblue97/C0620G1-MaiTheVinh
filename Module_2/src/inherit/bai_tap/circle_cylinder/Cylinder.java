package inherit.bai_tap.circle_cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        this(1.0);
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius, String color, boolean filled) {
        super(radius, color, filled);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return "The cylinder has radius:" + super.getRadius() + ", color:" + super.getColor() +
                ", height:" + this.height + " and the volume: " + getVolume();
    }
}
