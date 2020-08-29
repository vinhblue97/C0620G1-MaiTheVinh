package controllers;

import models.Customer;
import models.House;
import models.Room;
import models.Villa;
import views.EmployeeManager;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MainController {
    static boolean check = true;
    static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu(List<Villa> villaList, List<House> houseList, List<Room> roomList, Map<Integer, Customer> bookingList, List<Customer> customersList) throws Exception {
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
                    NewService.addNewService(villaList, houseList, roomList);
                    check = NewService.isCheck();
                    break;
                case 2:
                    DisplayService.displayService(villaList, houseList, roomList);
                    check = DisplayService.isCheck();
                    break;
                case 3:
                    NewCustomer.addNewCustomer(customersList);
                    break;
                case 4:
                    DisplayCustomerInformation.showCustomerInfor(customersList);
                    break;
                case 5:
                    AddNewBook.addNewBook(villaList, houseList, roomList, bookingList, customersList);
                    break;
                case 6:
                    EmployeeManager.readEmployeeFile();
                    break;
                case 7:
                    break mainLoop;
            }
        } while (true);
    }


}