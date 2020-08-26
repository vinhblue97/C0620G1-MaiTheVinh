package controllers;

import models.House;
import models.Room;
import models.Villa;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class MainController {
    boolean check = true;
    LinkedList<Villa> villaList = new LinkedList<>();
    LinkedList<House> houseList = new LinkedList<>();
    LinkedList<Room> roomList = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() throws IOException {
        int choiseMenu = 0;
        mainLoop:
        do {
            if (!check) {
                break mainLoop;
            }
            System.out.println("1. Add New Service\n" +
                    "2. Show Service\n" +
                    "3. Add New Customer" +
                    "4. Show Information of Customer\n" +
                    "5. Add New Blocking\n" +
                    "6. Show Information of Employee\n" +
                    "7. Exit");
            choiseMenu = scanner.nextInt();
            switch (choiseMenu) {
                case 1:
                    NewService newService = new NewService();
                    newService.addNewService(villaList, houseList, roomList);
                    check = newService.isCheck();
                    displayMainMenu();
                case 2:
                    DisplayService display = new DisplayService();
                    display.displayService(villaList, houseList, roomList);
                    check = display.isCheck();
                    displayMainMenu();
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    break mainLoop;
            }
        } while (true);
    }

}
