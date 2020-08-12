package loop_in_java.thuc_hanh;

import java.util.Scanner;

public class CommonDevisor {
    public static void main(String[] args) {
        int num1, num2, divisor = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        num1 = sc.nextInt();
        System.out.print("Nhập số thứ hai: ");
        num2 = sc.nextInt();
        if (num1 < num2) {
            for (int i = num1; i > 0; i--) {
                boolean check = num1 % i == 0 && num2 % i == 0;
                if (check) {
                    divisor = i;
                    break;
                }
            }
        } else {
            for (int i = num2; i > 0; i--) {
                boolean check = num1 % i == 0 && num2 % i == 0;
                if (check) {
                    divisor = i;
                    break;
                }
            }
        }
        System.out.print("The Common Divisor is: "+ divisor);
    }
}
