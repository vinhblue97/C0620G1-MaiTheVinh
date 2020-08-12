package loop_in_java.thuc_hanh;

import java.util.Scanner;

public class DrawMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose one of choises\n" +
                "1. Draw triagle\n" +
                "2. Draw Square\n" +
                "3. Draw Retagle");
        do {
            int choise = sc.nextInt();
            switch (choise) {
                case 1:
                    System.out.println("Draw the triagle\n" +
                            "******\n" +
                            "*****\n" +
                            "****\n" +
                            "***\n" +
                            "**\n" +
                            "*");
                    break;
                case 2:
                    System.out.println("Draw the square\n" +
                            "******\n" +
                            "******\n" +
                            "******");
                    break;
                case 3:
                    System.out.println("Draw the retagl\n" +
                            "******\n" +
                            "******\n" +
                            "******\n" +
                            "******");
                    break;
            }
        } while(true);
    }
}
