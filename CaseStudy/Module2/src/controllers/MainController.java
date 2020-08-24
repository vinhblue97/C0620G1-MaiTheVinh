package controllers;

import data.WriteFile;
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
    Scanner scaner = new Scanner(System.in);

    public void displayMainMenu() throws IOException {
        int choiseMenu = 0;
        mainLoop:
        do {
            if (check == false) {
                break mainLoop;
            }
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
                    showService();
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

    public void addNewService() throws IOException {
        int choise = 0;
        addLoop:
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
                    break;
                case 2:
                    addHouse();
                    break;
                case 3:
                    addRoom();
                    break;
                case 4:
                    break addLoop;
                case 5:
                    check = false;
                    break addLoop;
            }
        } while (true);
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

    public void addHouse() throws IOException {
        WriteFile write = new WriteFile();
        House temp = new House("name1", 1.0, 30, 15, 0, 0, 1, 0, 3);
        House temp2 = new House("name1", 45.0, 10, 455, 0, 0, 1, 0, 2);
        House temp3 = new House("name1", 9.0, 6, 123, 1, 0, 1, 0, 6);
        houseList.add(temp);
        houseList.add(temp2);
        houseList.add(temp3);
        write.writeHouse(houseList);
    }

    public void addRoom() throws IOException {
        WriteFile write = new WriteFile();
        Room temp = new Room("name1", 1.0, 30, 15, 0, 0, 1, 0);
        System.out.println(temp.getRoomID());
        Room temp2 = new Room("name1", 45.0, 10, 455, 0, 0, 1, 0);
        System.out.println(temp2.getRoomID());
        Room temp3 = new Room("name1", 9.0, 6, 123, 1, 0, 1, 0);
        System.out.println(temp3.getRoomID());
        roomList.add(temp);
        roomList.add(temp2);
        roomList.add(temp3);
        write.writeRoom(roomList);
    }
    public void showService(){

    }
}
