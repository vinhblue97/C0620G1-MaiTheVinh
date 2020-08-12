package inherit.bai_tap.circle_cylinder;

public class Circle {
    private double radius;
    private String color;
    private boolean filled;

    public Circle() {
        this(1.0,"blue",false);
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.round(Math.pow(this.radius, 2) * Math.PI*1000)/1000;
    }

    public String toString() {
        return "The circle has radius: " + this.radius + ", color: " + this.color + " and the area: " + getArea();
    }
}
