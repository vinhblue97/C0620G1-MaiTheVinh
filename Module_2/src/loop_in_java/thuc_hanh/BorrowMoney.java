package loop_in_java.thuc_hanh;

import java.util.Scanner;

public class BorrowMoney {
    public static void main(String[] args) {
        float borrowMoney, interest;
        int months;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tiền bạn muốn vay: ");
        borrowMoney = sc.nextFloat();
        System.out.print("Nhập lãi suất vay theo tháng: ");
        interest = sc.nextFloat();
        System.out.print("Nhập số tháng: ");
        months = sc.nextInt();
        for (int i = 0; i < months; i++) {
            borrowMoney += borrowMoney * interest / 100;
        }
        System.out.print(borrowMoney);
        ;
    }
}
