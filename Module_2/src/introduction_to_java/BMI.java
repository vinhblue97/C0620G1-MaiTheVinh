package introduction_to_java;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        float weight, height;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập cân nặng(kg): ");
        weight = sc.nextFloat();
        System.out.print("Nhập chiều cao(m): ");
        height = sc.nextFloat();
        float bmi = (float) (weight / Math.pow(height, 2));
        boolean check1, check2, check3;
        check1 = bmi < 18.5;
        check2 = bmi < 25.0;
        check3 = bmi < 30.0;
        if (check1) {
            System.out.print("Underweight");
        } else if (check2) {
            System.out.print("Normal");
        } else if (check3) {
            System.out.print("Overweight");
        } else {
            System.out.print("Obese");
        }
    }
}

