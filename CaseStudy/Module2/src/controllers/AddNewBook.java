package controllers;

import models.*;

import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AddNewBook {
    Map<Customer, Services> bookingList = new TreeMap<>();
    transient Scanner scanner = new Scanner(System.in);
    List<Customer> customersList;
    List<Villa> villaList;
    List<House> houseList;
    List<Room> roomList;

    public AddNewBook(Map<Customer, Services> bookingList,List<Customer> customersList, List<Villa> villaList, List<House> houseList, List<Room> roomList) {
        this.customersList = customersList;
        this.villaList = villaList;
        this.houseList = houseList;
        this.roomList = roomList;
        this.bookingList = bookingList;
    }

    public void addNewBook() throws IOException {
        DisplayCustomerInformation display = new DisplayCustomerInformation(customersList);
        display.showCustomerInfor();
        System.out.println("Choose the customer: ");
        int index = Integer.parseInt(scanner.nextLine());
        System.out.println("1.\tBooking Villa\n" +
                "2.\tBooking House\n" +
                "3.\tBooking Room\n" +
                "4. Back to menu");
        int choise = Integer.parseInt(scanner.nextLine());
        switch (choise) {
            case 1:
                bookVilla(index);
                return;
            case 2:
                bookHouse(index);
                return;
            case 3:
                bookRoom(index);
                return;
            case 4:
                return;
        }
    }

    public void bookVilla(int index) throws IOException {
        DisplayService displayService = new DisplayService(villaList, houseList, roomList,false);
        try{
            displayService.showAllVilla();
            System.out.println("Choose the villa");
            int villa = Integer.parseInt(scanner.nextLine());
            writeBookingFile(index, 1, villa);
        } catch (EOFException e){
        }
        finally {
            addNewBook();
            return;
        }
    }

    public void bookHouse(int index) throws IOException {
        DisplayService displayService = new DisplayService(villaList, houseList, roomList,false);
        try{
            displayService.showAllHouse();
            System.out.println("Choose the house");
            int house = Integer.parseInt(scanner.nextLine());
            writeBookingFile(index, 2, house);
        } catch (EOFException e){
        }finally {
            addNewBook();
            return;
        }
    }

    public void bookRoom(int index) throws IOException {
        DisplayService displayService = new DisplayService(villaList, houseList, roomList,false);
        try{
            displayService.showAllRoom();
            System.out.println("Choose the villa");
            int room = Integer.parseInt(scanner.nextLine());
            writeBookingFile(index, 3, room);
        } catch (EOFException e){
        }finally {
            addNewBook();
            return;
        }
    }

    public void writeBookingFile(int index, int choiseService, int choise) throws IOException {
        String bookingFile = "E:\\C0620G1-MaiTheVinh\\CaseStudy\\Module2\\src\\data\\Booking.csv";
        Customer customer = customersList.get(index-1);
        switch (choiseService) {
            case 1:
                Villa villa = villaList.get(choise-1);
                bookingList.put(customer, villa);
                break;
            case 2:
                House house = houseList.get(choise-1);
                bookingList.put(customer, house);
                break;
            case 3:
                Room room = roomList.get(choise-1);
                bookingList.put(customer, room);
                break;
        }
        FileOutputStream os = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            os = new FileOutputStream(bookingFile);
            objectOutputStream = new ObjectOutputStream(os);
            objectOutputStream.writeObject(bookingList);
            System.out.println("Write file Booking.csv successfully");
        } catch(EOFException e){
            System.err.println("Can not write file");
        }
        finally {
            assert objectOutputStream != null;
            objectOutputStream.close();
            os.close();
            addNewBook();
            return;
        }
    }

//    public void readFileBooking(){
//        String bookingFile = "E:\\C0620G1-MaiTheVinh\\CaseStudy\\Module2\\src\\data\\Booking.csv";
//        FileInputStream input;
//        ObjectInputStream objectInputStream;
//        try{
//            input = new FileInputStream(bookingFile);
//            objectInputStream = new ObjectInputStream(input);
//            bookingList = (Map<Customer, Services>) objectInputStream.readObject();
//            for (Customer customer:bookingList.keySet()){
//                Services services = bookingList.get(customer);
//                System.out.println("-------------------------------------");
//                System.out.println("--------------CUSTOMER---------------");
//                System.out.println(customer.showInfor());
//                System.out.println("--------------SERVICE----------------");
//                System.out.println(services.showInfor());
//                System.out.println("-------------------------------------");
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
}
