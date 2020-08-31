package controllers;

import models.Customer;
import models.House;
import models.Room;
import models.Villa;

import java.util.*;

public class MainController {
    static boolean check = true;
    static Scanner scanner = new Scanner(System.in);
    public List<Villa> villaList;
    public List<House> houseList;
    public List<Room> roomList;
    public Map<Integer, Customer> bookingList;
    public List<Customer> customersList;

    public MainController(List<Villa> villaList, List<House> houseList, List<Room> roomList, Map<Integer, Customer> bookingList, List<Customer> customersList) {
        this.villaList = villaList;
        this.houseList = houseList;
        this.roomList = roomList;
        this.bookingList = bookingList;
        this.customersList = customersList;
    }

    public void displayMainMenu() throws Exception {
        int choiseMenu;
        mainLoop:
        do {
            if (!check) {
                break;
            }
            System.out.println("1. Add New Service\n" +
                    "2. Show Service\n" +
                    "3. Add New Customer" + "\n" +
                    "4. Show Information of Customer\n" +
                    "5. Add New Booking\n" +
                    "6. Show Information of Employee\n" +
                    "7. Exit");
            choiseMenu = scanner.nextInt();
            switch (choiseMenu) {
                case 1:
                    NewService newService = new NewService(villaList, houseList, roomList);
                    newService.addNewService();
                    check = newService.isCheck();
                    System.out.println(villaList);
                    break;
                case 2:
                    System.out.println(villaList);
                    DisplayService displayService = new DisplayService(villaList, houseList, roomList);
                    displayService.displayService();
                    check = displayService.isCheck();
                    break;
                case 3:
                    NewCustomer newCustomer = new NewCustomer(customersList);
                    newCustomer.addNewCustomer();
                    break;
                case 4:
                    DisplayCustomerInformation displayCustomerInformation = new DisplayCustomerInformation(customersList);
                    displayCustomerInformation.showCustomerInfor();
                    break;
                case 5:
                    AddNewBook addNewBook = new AddNewBook();
                    addNewBook.addNewBook(villaList, houseList, roomList, bookingList, customersList);
                    break;
                case 6:
                    EmployeeManager employeeManager = new EmployeeManager();
                    employeeManager.readEmployeeFile();
                    break;
                case 7:
                    break mainLoop;
            }
        } while (true);
    }


}