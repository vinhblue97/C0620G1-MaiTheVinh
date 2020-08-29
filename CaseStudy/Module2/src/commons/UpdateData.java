package commons;

import models.Customer;
import models.House;
import models.Room;
import models.Villa;

import java.util.List;
import java.util.Map;

public class UpdateData {

    public static void update(List<Villa> villaList, List<House> houseList, List<Room> roomList, Map<Integer, Customer> bookingList, List<Customer> customersList) throws Exception {
        updateVillaFile(villaList);
        updateHouseFile(houseList);
        updateRoomFile(roomList);
        updateBookingFile(bookingList);
        updateCustomerFile(customersList);
    }

    public static void  updateVillaFile(List<Villa> villaList){
        String villaPath = "E:\\C0620G1-MaiTheVinh\\CaseStudy\\Module2\\src\\data\\Villa.csv";
        FileUtils<List<Villa>> fileUtils = new FileUtils<>();
        villaList = fileUtils.readFileCSV(villaPath);
    }

    public static void updateHouseFile(List<House> houseList){
        String housePath = "E:\\C0620G1-MaiTheVinh\\CaseStudy\\Module2\\src\\data\\House.csv";
        FileUtils<List<House>> fileUtils = new FileUtils<>();
        houseList = fileUtils.readFileCSV(housePath);
    }

    public static void updateRoomFile(List<Room> roomList){
        String roomPath = "E:\\C0620G1-MaiTheVinh\\CaseStudy\\Module2\\src\\data\\Room.csv";
        FileUtils<List<Room>> fileUtils = new FileUtils<>();
        roomList = fileUtils.readFileCSV(roomPath);
    }

    public static void updateBookingFile(Map<Integer, Customer> bookingList){
        String bookingFile = "E:\\C0620G1-MaiTheVinh\\CaseStudy\\Module2\\src\\data\\Booking.csv";
        FileUtils<Map<Integer, Customer>> fileUtils = new FileUtils<>();
        bookingList = fileUtils.readFileCSV(bookingFile);
    }

    public static void updateCustomerFile(List<Customer> customersList){
        String customerPath = "E:\\C0620G1-MaiTheVinh\\CaseStudy\\Module2\\src\\data\\Customer.csv";
        FileUtils<List<Customer>> fileUtils = new FileUtils<>();
        customersList = fileUtils.readFileCSV(customerPath);
    }
}
