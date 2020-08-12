package introduction_to_java;

import java.util.Scanner;

public class RetagleArea {
    public static void main (String[] args){
        float width, length;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều rộng: ");
        width = sc.nextFloat();
        System.out.print("Nhập chiều dài: ");
        length = sc.nextFloat();
        float area = width*length;
        System.out.print("Diện tích hình chữ nhật: "+area);
    }
}
