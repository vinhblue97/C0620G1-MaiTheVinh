package class_object.thuc_hanh;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Rectangle {
    double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{ width = " + this.width + ", height = " + this.height + "}";
    }
}

class Ex14_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width: ");
        double width = sc.nextDouble() ;
        System.out.print("Enter the height: ");
        double height = sc.nextDouble() ;
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Your rectangle: "+ rectangle.display());
        System.out.println("Area: "+ rectangle.getArea());
        System.out.println("Perimeter: "+ rectangle.getPerimeter());
    }
}