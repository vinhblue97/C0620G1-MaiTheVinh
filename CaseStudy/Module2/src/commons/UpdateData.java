package commons;

import controllers.MainController;
import models.Customer;
import models.House;
import models.Room;
import models.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class UpdateData {
    public List<Villa> villaList = new ArrayList<>();
    public List<House> houseList = new ArrayList<>();
    public List<Room> roomList = new ArrayList<>();
    public Map<Integer, Customer> bookingList = new TreeMap<>();
    public List<Customer> customersList = new ArrayList<>();

    public void update() throws Exception {
        updateVillaFile();
        updateHouseFile();
        updateRoomFile();
        updateBookingFile();
        updateCustomerFile();
        MainController mainController = new MainController(villaList, houseList, roomList, bookingList, customersList);
        mainController.displayMainMenu();

    }

    public void updateVillaFile() {
        String villaPath = "E:\\C0620G1-MaiTheVinh\\CaseStudy\\Module2\\src\\data\\Villa.csv";
        FileUtils<List<Villa>> fileUtils = new FileUtils<>();
        villaList = fileUtils.readFileCSV(villaPath);
    }

    public void updateHouseFile() {
        String housePath = "E:\\C0620G1-MaiTheVinh\\CaseStudy\\Module2\\src\\data\\House.csv";
        FileUtils<List<House>> fileUtils = new FileUtils<>();
        houseList = fileUtils.readFileCSV(housePath);
    }

    public void updateRoomFile() {
        String roomPath = "E:\\C0620G1-MaiTheVinh\\CaseStudy\\Module2\\src\\data\\Room.csv";
        FileUtils<List<Room>> fileUtils = new FileUtils<>();
        roomList = fileUtils.readFileCSV(roomPath);
    }

    public void updateBookingFile() {
        String bookingFile = "E:\\C0620G1-MaiTheVinh\\CaseStudy\\Module2\\src\\data\\Booking.csv";
        FileUtils<Map<Integer, Customer>> fileUtils = new FileUtils<>();
        bookingList = fileUtils.readFileCSV(bookingFile);
    }

    public void updateCustomerFile() {
        String customerPath = "E:\\C0620G1-MaiTheVinh\\CaseStudy\\Module2\\src\\data\\Customer.csv";
        FileUtils<List<Customer>> fileUtils = new FileUtils<>();
        customersList = fileUtils.readFileCSV(customerPath);
    }
}
