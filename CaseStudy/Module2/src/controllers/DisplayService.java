package controllers;

import models.House;
import models.Room;
import models.Services;
import models.Villa;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DisplayService {
    private Map<String, Services> villaMap = new TreeMap<>();
    private Map<String, Services> houseMap = new TreeMap<>();
    private Map<String, Services> roomMap = new TreeMap<>();
    public List<Villa> villaList;
    public List<House> houseList;
    public List<Room> roomList;

    private boolean check = true;   // variable use to Exit (false - exit program)

    public boolean isCheck() {
        return check;
    }

    transient Scanner scanner = new Scanner(System.in);

    public DisplayService(List<Villa> villaList, List<House> houseList, List<Room> roomList) {
        this.villaList = villaList;
        this.houseList = houseList;
        this.roomList = roomList;
    }

    public void displayService() {
        String choise;
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
            choise = scanner.nextLine();
            try {
                switch (choise) {
                    case "1":
                        showAllVilla();
                        break;
                    case "2":
                        showAllHouse();
                        break;
                    case "3":
                        showAllRoom();
                        break;
                    case "4":
                        showAllVillaNotDuplicate();
                        break;
                    case "5":
                        showAllHouseNotDuplicate();
                        break;
                    case "6":
                        showAllRoomNotDuplicate();
                        break;
                    case "7":
                        break showLoop;
                    case "8":
                        check = false;
                }
            } catch (NullPointerException e) {
                System.err.println("File is empty");
            }
        } while (check);
    }

    public void showAllVilla() throws NullPointerException {
        for (Villa villa : villaList) {
            System.out.println(villa.showInfor());
            System.out.println("");
        }
    }

    public void showAllHouse() throws NullPointerException {
        for (House house : houseList) {
            System.out.println(house.showInfor());
            System.out.println("");
        }
    }

    public void showAllRoom() throws NullPointerException{
        for (Room room : roomList) {
            System.out.println(room.showInfor());
            System.out.println("");
        }
    }

    public void showAllVillaNotDuplicate() {
        for (Villa villa : villaList) {
            villaMap.put(villa.getServiceName(), villa);
        }
        for (String name : villaMap.keySet()) {
            System.out.println(villaMap.get(name).showInfor());
        }
    }

    public void showAllHouseNotDuplicate() {
        for (House house : houseList) {
            houseMap.put(house.getServiceName(), house);
        }
        for (String name : houseMap.keySet()) {
            System.out.println(houseMap.get(name).showInfor());
        }
    }

    public void showAllRoomNotDuplicate() {
        for (Room room : roomList) {
            roomMap.put(room.getServiceName(), room);
        }
        for (String name : roomMap.keySet()) {
            System.out.println(roomMap.get(name).showInfor());
        }
    }
}
