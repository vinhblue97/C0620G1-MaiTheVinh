package controllers;

import customer.Customer;
import models.House;
import models.Room;
import models.Villa;

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class MainController {
    boolean check = true;
    LinkedList<Villa> villaList = new LinkedList<>();
    LinkedList<House> houseList = new LinkedList<>();
    LinkedList<Room> roomList = new LinkedList<>();
    LinkedList<Customer> customersList = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() throws Exception {
        int choiseMenu = 0;
        mainLoop:
        do {
            if (!check) {
                break;
            }
            System.out.println("1. Add New Service\n" +
                    "2. Show Service\n" +
                    "3. Add New Customer" + "\n" +
                    "4. Show Information of Customer\n" +
                    "5. Add New Blocking\n" +
                    "6. Show Information of Employee\n" +
                    "7. Exit");
            choiseMenu = scanner.nextInt();
            switch (choiseMenu) {
                case 1:
                    NewService newService = null;
                    try {
                        newService = new NewService();
                        newService.addNewService(villaList, houseList, roomList);
                    } catch (NullPointerException e) {

                    } finally {
                        assert newService != null;
                        check = newService.isCheck();
                        displayMainMenu();
                        break;
                    }
                case 2:
                    DisplayService display = null;
                    try {
                        display = new DisplayService(villaList, houseList, roomList);
                        display.displayService();
                    } catch (NullPointerException e) {

                    } finally {
                        assert display != null;
                        check = display.isCheck();
                        displayMainMenu();
                        break;
                    }
                case 3:
                    NewCustomer<Customer> newCustomer;
                    try {
                        newCustomer = new NewCustomer<>(customersList);
                        newCustomer.addNewCustomer();
                    } catch (WriteAbortedException | NotSerializableException ignored) {

                    } finally {
                        check = false;
                        displayMainMenu();
                        break;
                    }
                case 4:
                    DisplayCustomerInformation customerInformation = null;
                    try{
                        customerInformation = new DisplayCustomerInformation(customersList);
                        customerInformation.showCustomerInfor();
                    }finally {
                        check = false;
                        displayMainMenu();
                        break;
                    }
                case 5:
                case 6:
                case 7:
                    break mainLoop;
            }
        } while (true);
    }

    public void update() throws Exception {
        updateVillaFile();
    }

    public void updateVillaFile() throws Exception {
        String villaPath = "E:\\C0620G1-MaiTheVinh\\CaseStudy\\Module2\\src\\data\\Villa.csv";
        ObjectInputStream readVilla = null;
        try {
            FileInputStream inputVilla = new FileInputStream(villaPath);
            readVilla = new ObjectInputStream(inputVilla);
            villaList = (LinkedList<Villa>) readVilla.readObject();
            readVilla.close();
        } catch (FileNotFoundException e) {
            FileOutputStream villa = new FileOutputStream(villaPath);
        } catch (EOFException e) {
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        } finally {
            updateHouseFile();
        }
    }

    public void updateHouseFile() throws Exception {
        String housePath = "E:\\C0620G1-MaiTheVinh\\CaseStudy\\Module2\\src\\data\\House.csv";
        ObjectInputStream readHouse = null;
        try {
            FileInputStream inputHouse = new FileInputStream(housePath);
            readHouse = new ObjectInputStream(inputHouse);
            houseList = (LinkedList<House>) readHouse.readObject();
        } catch (FileNotFoundException e) {
            FileOutputStream house = new FileOutputStream(housePath);
        } catch (EOFException e) {
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        } finally {
            updateRoomFile();
        }
    }

    public void updateRoomFile() throws Exception {
        String roomPath = "E:\\C0620G1-MaiTheVinh\\CaseStudy\\Module2\\src\\data\\Room.csv";
        ObjectInputStream readRoom = null;
        try {
            FileInputStream inputRoom = new FileInputStream(roomPath);
            readRoom = new ObjectInputStream(inputRoom);
            roomList = (LinkedList<Room>) readRoom.readObject();
            readRoom.close();
        } catch (FileNotFoundException e) {
            FileOutputStream room = new FileOutputStream(roomPath);
        } catch (EOFException e) {
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        } finally {
            updateCustomerFile();
        }
    }

    public void updateCustomerFile() throws Exception {
        String customerPath = "E:\\C0620G1-MaiTheVinh\\CaseStudy\\Module2\\src\\data\\Customer.csv";
        ObjectInputStream readCustomer = null;
        try {
            FileInputStream inputCustomer = new FileInputStream(customerPath);
            readCustomer = new ObjectInputStream(inputCustomer);
            customersList = (LinkedList<Customer>) readCustomer.readObject();
        } catch (FileNotFoundException e) {
            FileOutputStream customer = new FileOutputStream(customerPath);
        } catch (EOFException e) {
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        } finally {
            displayMainMenu();
        }
    }
}