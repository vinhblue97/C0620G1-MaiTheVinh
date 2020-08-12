package introduction_to_java;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        float a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        a = sc.nextFloat();
        System.out.print("Nhập số b: ");
        b = sc.nextFloat();
        boolean check = a != 0;
        boolean check2 = b==0;
        if (check) {
            float result = -b/a;
            System.out.print("Phương trình có nghiệm là " +result);
        } else {

            if (check2) {
                System.out.print("Phương trình có vô số nghiệm");
            }
            else {
                System.out.print("Phương trình vô nghiệm");
            }
        }
    }
}
