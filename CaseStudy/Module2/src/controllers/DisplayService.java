package controllers;

import models.House;
import models.Room;
import models.Villa;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class DisplayService {
    private boolean check = true;
    public boolean isCheck() {
        return check;
    }

    Scanner scanner = new Scanner(System.in);

    public void displayService(LinkedList<Villa> villaList, LinkedList<House> houseList, LinkedList<Room> roomList) {
        int choise = 0;
        showLoop:
        do {
            check = true;
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
                case 5:
                case 6:

                    break;
                case 7:
                    break showLoop;
                case 8:
                    this.check = false;
                    break showLoop;
            }
        } while (true);
    }

    public void showAllVilla(LinkedList<Villa> villaList) {
        System.out.println("------------------VILLA LIST------------------");
        try {
            String VILLA_FILE = "E:\\C0620G1-MaiTheVinh\\CaseStudy\\Module2\\src\\data\\Villa.csv";
            String VILLA_HEADER = "Id,Name,Area,Renting cost,Maximun People,Type of Renting (hours),Pool's Area,Amount of Floor";
            BufferedReader br = new BufferedReader(new FileReader(VILLA_FILE));
            String line = "";
            while ((line = br.readLine()) != null) {
                String temp = "";
                if (!VILLA_HEADER.equals(line)) {
                    int index = 0;
                    while (line.charAt(index) != ',') {
                        temp += line.charAt(index);
                        index++;
                    }
                    for (Villa villa : villaList) {
                        if (villa.getVillaID() == Integer.parseInt(temp)) {
                            System.out.println(villa.showInfor());
                            System.out.println("");
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        System.out.println("----------------------------------------------");
    }

    public void showAllHouse(LinkedList<House> houseList) {
        System.out.println("------------------HOUSE LIST------------------");
        try {
            String HOUSE_FILE = "E:\\C0620G1-MaiTheVinh\\CaseStudy\\Module2\\src\\data\\House.csv";
            String HOUSE_HEADER = "Id,Name,Area,Renting cost,Maximun People,Type of Renting (hours),Amount of Floor";
            BufferedReader br = new BufferedReader(new FileReader(HOUSE_FILE));
            String line = "";
            while ((line = br.readLine()) != null) {
                String temp = "";
                if (!HOUSE_HEADER.equals(line)) {
                    int index = 0;
                    while (line.charAt(index) != ',') {
                        temp += line.charAt(index);
                        index++;
                    }
                    for (House house : houseList) {
                        if (house.getHouseID() == Integer.parseInt(temp)) {
                            System.out.println(house.showInfor());
                            System.out.println("");
                        }
                    }
                }
            }
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        System.out.println("----------------------------------------------");
    }

    public void showAllRoom(LinkedList<Room> roomList) {
        System.out.println("------------------ROOM LIST------------------");
        try {
            String ROOM_FILE = "E:\\C0620G1-MaiTheVinh\\CaseStudy\\Module2\\src\\data\\Room.csv";
            String ROOM_HEADER = "Id,Name,Area,Renting cost,Maximun People,Type of Renting (hours)";
            BufferedReader br = new BufferedReader(new FileReader(ROOM_FILE));
            String line = "";
            while ((line = br.readLine()) != null) {
                String temp = "";
                if (!ROOM_HEADER.equals(line)) {
                    int index = 0;
                    while (line.charAt(index) != ',') {
                        temp += line.charAt(index);
                        index++;
                    }
                    for (Room room : roomList) {
                        if (room.getRoomID() == Integer.parseInt(temp)) {
                            System.out.println(room.showInfor());
                            System.out.println("");
                        }
                    }
                }
            }
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        System.out.println("----------------------------------------------");
    }
}
