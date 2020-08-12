package loop_in_java.bai_tap;

import java.util.Scanner;

public class DisplayDraw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose one of choises\n" +
                "1. Draw triagle\n" +
                "2. Draw Square\n" +
                "3. Draw Retagle\n" +
                "4. Exit");
        loop:
        do {
            int choise = sc.nextInt();
            switch (choise) {
                case 1:
                    System.out.println("Draw the triagle");
                    System.out.print("Enter the triagle's length");
                    int length = sc.nextInt();
                    for (int i = 0; i < length; i++) {
                        for (int j = 0; j < length; j++) {
                            if (j < length - i) {
                                System.out.print("* ");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("Draw the square");
                    System.out.print("Enter the square's width");
                    int width = sc.nextInt();
                    for (int i = 0; i < width; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.println("Draw the retagle");
                    System.out.print("Enter the retangle's width");
                    width = sc.nextInt();
                    System.out.print("Enter the retangle's length");
                    length = sc.nextInt();
                    for (int i = 0; i < width; i++) {
                        for (int j = 0; j < length; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 4:
                    break loop;
            }
        } while (true);
    }
}
