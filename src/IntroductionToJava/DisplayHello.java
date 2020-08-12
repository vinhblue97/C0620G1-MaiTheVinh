package IntroductionToJava;

import java.util.Scanner;

public class DisplayHello {
    public static void main(String[] args){
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        name = sc.nextLine();
        System.out.print("Hello: "+name);
    }
}
