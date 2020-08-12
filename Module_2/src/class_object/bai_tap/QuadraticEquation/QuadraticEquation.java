package class_object.bai_tap.QuadraticEquation;

import java.util.Scanner;

public class QuadraticEquation {

    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getterA() {
        return this.a;
    }

    public double getterB() {
        return this.b;
    }

    public double getterC() {
        return this.c;
    }

    public double getDiscriminant() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return (-this.b + Math.sqrt(getDiscriminant())) / (2 * this.a);
    }

    public double getRoot2() {
        return (-this.b - Math.sqrt(getDiscriminant())) / (2 * this.a);
    }
}

class QuadraticEducation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the factor a");
        double a = scanner.nextDouble();
        System.out.print("Enter the factor b");
        double b = scanner.nextDouble();
        System.out.print("Enter the factor c");
        double c = scanner.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double delta = equation.getDiscriminant();
        if (delta >= 0) {
            System.out.print("The equation: " + equation.getterA() + "x^2 + " + equation.getterB() + "x + " + equation.getterC() + " = 0 has two roots are:\n" +
                    "First root: " + equation.getRoot1() + "\n" +
                    "Second root: " + equation.getRoot2());
        } else {
            System.out.print("The equation has no root");
        }
    }
}
