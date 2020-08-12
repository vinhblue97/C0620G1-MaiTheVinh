package array;

import java.util.Scanner;

public class CountTextInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Mai The Vinhqwqqgqegsafs2elksfokqasdsdklaaaaaaaasdkn";
        System.out.print("NHập kí tự muốn đếm: ");
        char text = sc.nextLine().charAt(0);
        int count = 0;
        for (int index = 0; index < str.length(); index++) {
            if (str.charAt(index) == text) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của kí tự " + text + " là: " + count);
    }
}
