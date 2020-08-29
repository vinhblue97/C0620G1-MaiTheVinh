package controllers;

import commons.FileUtils;
import models.*;

import java.io.*;
import java.util.*;

public class AddNewBook {
    static boolean checkRead = false;
    static Scanner scanner = new Scanner(System.in);
    static Queue<Customer> cinemaQueue = new LinkedList<>();

    public static void addNewBook(List<Villa> villaList, List<House> houseList, List<Room> roomList, Map<Integer, Customer> bookingList, List<Customer> customersList) throws IOException {
        if (!checkRead) {
            readFileBooking(bookingList);
        }
        DisplayCustomerInformation.showCustomerInfor(customersList);
        System.out.println("Choose the customer: ");
        int index = Integer.parseInt(scanner.nextLine());
        System.out.println("1.\tBooking Villa\n" +
                "2.\tBooking House\n" +
                "3.\tBooking Room\n" +
                "4. Back to menu");
        int choise = Integer.parseInt(scanner.nextLine());
        switch (choise) {
            case 1:
                DisplayService.showAllVilla(villaList);
                System.out.println("Choose the villa");
                int villa = Integer.parseInt(scanner.nextLine());
                writeBookingFile(index, 1, villa, bookingList, customersList, villaList, houseList, roomList);
                break;
            case 2:
                DisplayService.showAllHouse(houseList);
                System.out.println("Choose the house");
                int house = Integer.parseInt(scanner.nextLine());
                writeBookingFile(index, 2, house, bookingList, customersList, villaList, houseList, roomList);
                break;
            case 3:
                DisplayService.showAllRoom(roomList);
                System.out.println("Choose the villa");
                int room = Integer.parseInt(scanner.nextLine());
                writeBookingFile(index, 3, room, bookingList, customersList, villaList, houseList, roomList);
                break;
            case 4:
                checkRead = false;
                break;
        }
    }

    public static void writeBookingFile(int index, int choiseService, int choise, Map<Integer, Customer> bookingList, List<Customer> customersList, List<Villa> villaList, List<House> houseList, List<Room> roomList) throws IOException {
        String bookingFile = "E:\\C0620G1-MaiTheVinh\\CaseStudy\\Module2\\src\\data\\Booking.csv";
        Customer customer = customersList.get(index - 1);
        switch (choiseService) {
            case 1:
                customer.setUsedService(villaList.get(choise - 1));
                cinemaQueue = bookCinema(cinemaQueue, customer);
                bookingList.put(index, customer);
                break;
            case 2:
                customer.setUsedService(houseList.get(choise - 1));
                cinemaQueue = bookCinema(cinemaQueue, customer);
                bookingList.put(index, customer);
                break;
            case 3:
                customer.setUsedService(roomList.get(choise - 1));
                cinemaQueue = bookCinema(cinemaQueue, customer);
                bookingList.put(index, customer);
                break;
        }
        FileUtils<Map<Integer, Customer>> fileUtils = new FileUtils<>();
        fileUtils.writeFileCVS(bookingFile, bookingList);
    }

    public static void readFileBooking(Map<Integer, Customer> bookingList) throws IOException {
        String bookingFile = "E:\\C0620G1-MaiTheVinh\\CaseStudy\\Module2\\src\\data\\Booking.csv";
        FileUtils<Map<Integer, Customer>> fileUtils = new FileUtils<>();
        bookingList = fileUtils.readFileCSV(bookingFile);
        System.out.println("----------------------BOOKING LIST-------------------------");
        for (Integer index : bookingList.keySet()) {
            System.out.println("Customer: " + index);
            Customer customer = bookingList.get(index);
            System.out.println(customer.showInfor());
            System.out.println(customer.getUsedService().showInfor());
            System.out.println("**********************");
        }
        System.out.println("------------------------------------------------------------");
        checkRead = true;
    }

    public static Queue<Customer> bookCinema(Queue<Customer> cinemaQueue, Customer customer) {
        System.out.println("Do you want book cinema ticket? (Y/N)");
        String confirm = scanner.nextLine();
        do {
            if (confirm.equals("Y")) {
                System.out.println("You book cinema ticket successfully");
                cinemaQueue.add(customer);
            } else if (confirm.equals("N")) {
                System.out.println("You do not book cinema ticket");
            } else {
                System.out.println("You have to press Y or N");
            }
        } while (!confirm.equals("Y") && !confirm.equals("N"));
        for (Customer queue : cinemaQueue) {
            System.out.println(queue.getCustomerName());
        }
        return cinemaQueue;
    }
}
