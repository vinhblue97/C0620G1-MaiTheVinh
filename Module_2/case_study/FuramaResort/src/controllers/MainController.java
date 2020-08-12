package controllers;

import java.util.Scanner;

public class MainController {
    public void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        int choise;
        do {
            System.out.println("Enter one of these selection:\n" +
                    "1. Add New Service\n" +
                    "2. Show Service\n" +
                    "3. Add New Customer\n" +
                    "4. Show Information of Customer\n" +
                    "5. Add New Booking\n" +
                    "6. Show Information of Employee\n" +
                    "7. Exit");
            choise = scanner.nextInt();
            switch(choise){
                case 1: System.out.print("1");
                    break;
                case 2: System.out.print("2");
                    break;
                case 3:System.out.print("3");
                    break;
                case 4: System.out.print("4");
                    break;
                case 5:System.out.print("5");
                    break;
                case 6: System.out.print("6");
                    break;
                case 7: System.out.print("17");
                    break;
            }
        } while (choise<1||choise>7);
    }

}
