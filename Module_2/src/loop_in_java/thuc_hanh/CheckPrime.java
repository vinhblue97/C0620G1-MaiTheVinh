package loop_in_java.thuc_hanh;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        int number, check = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số muốn kiểm tra ");
        number = sc.nextInt();
        if (number <= 1) {
            System.out.print("Số " + number + " không phải số nguyên tố");
        } else {
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    check++;
                    if (check == 2) {
                        System.out.print("Số " + number + " không phải số nguyên tố");
                        check = 0;
                        break;
                    }
                }
            }
            if (check == 1) {
                System.out.print("Số " + number + " là số nguyên tố");
                check = 0;
            }
        }

    }
}
