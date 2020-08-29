package controllers;

import models.House;
import models.Room;
import models.Services;
import models.Villa;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DisplayService {
    private static Map<String, Services> villaMap = new TreeMap<>();
    private static Map<String, Services> houseMap = new TreeMap<>();
    private static Map<String, Services> roomMap = new TreeMap<>();

    private static boolean check = true;   // variable use to Exit (false - exit program)

    public static boolean isCheck() {
        return check;
    }

    static Scanner scanner = new Scanner(System.in);

    public static void displayService(List<Villa> villaList, List<House> houseList, List<Room> roomList) throws IOException {
        int choise;
        showLoop:
        do {
            System.out.println("1. Show all Villa\n" +
                    "2. Show all  House\n" +
                    "3. Show All Room\n" +
                    "4. Show All Name Villa Not Duplicate\n" +
                    "5. Show All Name House Not Duplicate\n" +
                    "6. Show All Name Name Not Duplicate\n" +
                    "7. Back to menu\n" +
                    "8. Exit");
            choise = scanner.nextInt();
            switch (choise) {
                case 1:
                    showAllVilla(villaList);
                    break;
                case 2:
                    showAllHouse(houseList);
                    break;
                case 3:
                    showAllRoom(roomList);
                    break;
                case 4:
                    showAllVillaNotDuplicate(villaList);
                    break;
                case 5:
                    showAllHouseNotDuplicate(houseList);
                    break;
                case 6:
                    showAllRoomNotDuplicate(roomList);
                    break;
                case 7:
                    break showLoop;
                case 8:
                    check = false;
            }
        } while (check);
    }

    public static void showAllVilla(List<Villa> villaList) throws IOException {
        for (Villa villa : villaList) {
            System.out.println(villa.showInfor());
            System.out.println("");
        }
    }

    public static void showAllHouse(List<House> houseList) throws IOException {
        for (House house : houseList) {
            System.out.println(house.showInfor());
            System.out.println("");
        }
    }

    public static void showAllRoom(List<Room> roomList) {
        for (Room room : roomList) {
            System.out.println(room.showInfor());
            System.out.println("");
        }
    }

    public static void showAllVillaNotDuplicate(List<Villa> villaList) {
        for (Villa villa : villaList) {
            villaMap.put(villa.getServiceName(), villa);
        }
        for (String name : villaMap.keySet()) {
            System.out.println(villaMap.get(name).showInfor());
        }
    }

    public static void showAllHouseNotDuplicate(List<House> houseList) {
        for (House house : houseList) {
            houseMap.put(house.getServiceName(), house);
        }
        for (String name : houseMap.keySet()) {
            System.out.println(houseMap.get(name).showInfor());
        }
    }

    public static void showAllRoomNotDuplicate(List<Room> roomList) {
        for (Room room : roomList) {
            roomMap.put(room.getServiceName(), room);
        }
        for (String name : roomMap.keySet()) {
            System.out.println(roomMap.get(name).showInfor());
        }
    }
}
