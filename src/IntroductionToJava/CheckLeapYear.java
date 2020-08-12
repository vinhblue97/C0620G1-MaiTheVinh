package IntroductionToJava;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args){
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập năm mà bạn muốn kiểm tra ");
        year = sc.nextInt();
        boolean check = year%400==0||(year%4==0&&year%100!=0);
        if (check){
            System.out.print("Năm "+year+" là năm nhuận");
        }
        else {
            System.out.print("Năm "+year+" không phải là năm nhuận");
        }
    }
}
