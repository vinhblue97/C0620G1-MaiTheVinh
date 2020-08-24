package controllers;

import data.WriteFile;
import models.Villa;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class MainController {
    LinkedList<Villa> villaList = new LinkedList<>();
    Scanner scaner = new Scanner(System.in);
    public void displayMainMenu() throws IOException {
        int choiseMenu = 0;
        MainMenu:
        do {
            System.out.println("1. Add New Service\n" +
                    "2. Show Service\n" +
                    "3. Add New Customer" +
                    "4. Show Information of Customer\n" +
                    "5. Add New Blocking\n" +
                    "6. Show Information of Employee\n" +
                    "7. Exit");
            Scanner scaner = new Scanner(System.in);
            choiseMenu = scaner.nextInt();
            switch (choiseMenu) {
                case 1:
                    addNewService();
                    displayMainMenu();
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7: break MainMenu;
            }
        } while (choiseMenu < 0 || choiseMenu > 7);
    }

    public void addNewService() throws IOException {
        int choise = 0;
        villaMenu:
        do {
            System.out.println("1. Add New Villa\n" +
                    "2. Add New House\n" +
                    "3. Add New Room\n" +
                    "4. Back to menu\n" +
                    "5. Exit\n");
            choise = scaner.nextInt();
            switch (choise) {
                case 1:
                    addVilla();
                case 2:
                case 3:
                case 4:
                case 5: break villaMenu;
            }
        } while (choise < 0 || choise > 5);
    }

    public void addVilla() throws IOException {
        WriteFile write = new WriteFile();
        Villa temp = new Villa("name1", 1.0, 30, 15, 0, 0, 1, 0, 15.0, 3);
        Villa temp2 = new Villa("name1", 45.0, 10, 455, 0, 0, 1, 0, 87.0, 2);
        Villa temp3 = new Villa("name1", 9.0, 6, 123, 1, 0, 1, 0, 32.0, 6);
        villaList.add(temp);
        villaList.add(temp2);
        villaList.add(temp3);
        write.writeVilla(villaList);
    }
}
