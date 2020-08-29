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

class Main {
    public static List<Villa> villaList = new ArrayList<>();
    public static List<House> houseList = new ArrayList<>();
    public static List<Room> roomList = new ArrayList<>();
    public static Map<Integer, Customer> bookingList = new TreeMap<>();
    public static List<Customer> customersList = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        UpdateData.update(villaList, houseList, roomList, bookingList, customersList);
        MainController.displayMainMenu(villaList, houseList, roomList, bookingList, customersList);
    }
}
