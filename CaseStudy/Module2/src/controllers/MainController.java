package controllers;

import models.*;

import java.io.*;
import java.util.*;

public class MainController {
    boolean check = true;
    Map<Customer, Services> bookingList = new TreeMap<>();
    List<Villa> villaList = new ArrayList<>();
    List<House> houseList = new ArrayList<>();
    List<Room> roomList = new ArrayList<>();
    List<Customer> customersList = new ArrayList<>();
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
                        break mainLoop;
                    }
                case 2:
                    DisplayService display = null;
                    try {
                        display = new DisplayService(villaList, houseList, roomList, true);
                        display.displayService();
                    } catch (NullPointerException e) {

                    } finally {
                        assert display != null;
                        check = display.isCheck();
                        displayMainMenu();
                        break mainLoop;
                    }
                case 3:
                    NewCustomer<Customer> newCustomer;
                    try {
                        newCustomer = new NewCustomer<>(customersList);
                        newCustomer.addNewCustomer();
                    } catch (WriteAbortedException | NotSerializableException ignored) {

                    } finally {
                        displayMainMenu();
                        break mainLoop;
                    }
                case 4:
                    DisplayCustomerInformation customerInformation = null;
                    try {
                        customerInformation = new DisplayCustomerInformation(customersList);
                        customerInformation.showCustomerInfor();
                    } finally {
                        displayMainMenu();
                        break mainLoop;
                    }
                case 5:
                    AddNewBook addNewBook;
                    try {
                        addNewBook = new AddNewBook(bookingList, customersList, villaList, houseList, roomList);
                        addNewBook.addNewBook();
                    } finally {
                        displayMainMenu();
                        break mainLoop;
                    }
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
            villaList = (ArrayList<Villa>) readVilla.readObject();
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
            houseList = (ArrayList<House>) readHouse.readObject();
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
            roomList = (ArrayList<Room>) readRoom.readObject();
            readRoom.close();
        } catch (FileNotFoundException e) {
            FileOutputStream room = new FileOutputStream(roomPath);
        } catch (EOFException e) {
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        } finally {
            updateBookingFile();
        }
    }

    public void updateBookingFile() throws Exception {
        String bookingFile = "E:\\C0620G1-MaiTheVinh\\CaseStudy\\Module2\\src\\data\\Booking.csv";
        ObjectInputStream readBooking = null;
        try {
            FileInputStream inputRoom = new FileInputStream(bookingFile);
            readBooking = new ObjectInputStream(inputRoom);
            bookingList = (TreeMap<Customer, Services>) readBooking.readObject();
            readBooking.close();
        } catch (FileNotFoundException e) {
            FileOutputStream booking = new FileOutputStream(bookingFile);
        } catch (EOFException e) {
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        } finally {
            updateCustomerFile();
        }
    }

    public void updateCustomerFile() throws Exception {
        String customerPath = "E:\\C0620G1-MaiTheVinh\\CaseStudy\\Module2\\src\\data\\Customer.csv";
        ObjectInputStream readCustomer;
        try {
            FileInputStream inputCustomer = new FileInputStream(customerPath);
            readCustomer = new ObjectInputStream(inputCustomer);
            customersList = (List<Customer>) readCustomer.readObject();
        } catch (FileNotFoundException e) {
            FileOutputStream customer = new FileOutputStream(customerPath);
        } catch (EOFException e) {
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        } finally {
            Test test = new Test(villaList);
            test.setTreeSet();
            test.printTreeSet();
            displayMainMenu();
        }
    }
}