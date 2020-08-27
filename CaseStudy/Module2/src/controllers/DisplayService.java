package controllers;

import models.House;
import models.Room;
import models.Villa;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedList;
import java.util.Scanner;

public class DisplayService {
    LinkedList<Villa> villaList;
    LinkedList<House> houseList;
    LinkedList<Room> roomList;
    private boolean check = true;

    public boolean isCheck() {
        return check;
    }

    Scanner scanner = new Scanner(System.in);

    public DisplayService(LinkedList<Villa> villaList, LinkedList<House> houseList, LinkedList<Room> roomList){
        this.villaList = villaList;
        this.houseList = houseList;
        this.roomList = roomList;
    }

    public void displayService() throws IOException {
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
                    showAllVilla();
                    break;
                case 2:
                    showAllHouse();
                    break;
                case 3:
                    showAllRoom();
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

    public void showAllVilla() throws IOException {
        String VILLA_HOUSE = "E:\\C0620G1-MaiTheVinh\\CaseStudy\\Module2\\src\\data\\Villa.csv";
        FileInputStream input = new FileInputStream(VILLA_HOUSE);
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(input);
            villaList = (LinkedList<Villa>) objectInputStream.readObject();
            System.out.println("------------------VILLA LIST------------------");
            for (Villa villa : villaList) {
                System.out.println(villa.showInfor());
                System.out.println("");
            }
            System.out.println("----------------------------------------------");
        }catch (EOFException | NullPointerException e ){
            System.err.println("File Villa.csv is empty, can not read file");
            displayService();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        finally {
            assert objectInputStream != null;
            objectInputStream.close();
        }
    }

    public void showAllHouse() throws IOException {
        String HOUSE_FILE = "E:\\C0620G1-MaiTheVinh\\CaseStudy\\Module2\\src\\data\\House.csv";
        FileInputStream input = new FileInputStream(HOUSE_FILE);
        ObjectInputStream objectInputStream = null;

        try {
            objectInputStream = new ObjectInputStream(input);
            houseList = (LinkedList<House>) objectInputStream.readObject();
            System.out.println("------------------HOUSE LIST------------------");
            for (House house : houseList) {
                System.out.println(house.showInfor());
                System.out.println("");
            }
            System.out.println("----------------------------------------------");
        }catch (EOFException | NullPointerException e ){
            System.err.println("File House.csv is empty, can not read file");
            displayService();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        finally {
            assert objectInputStream != null;
            objectInputStream.close();
        }
    }

    public void showAllRoom() throws IOException {
        String ROOM_FILE = "E:\\C0620G1-MaiTheVinh\\CaseStudy\\Module2\\src\\data\\Room.csv";

        FileInputStream input = new FileInputStream(ROOM_FILE);
        ObjectInputStream objectInputStream = null;

        try {
            objectInputStream = new ObjectInputStream(input);
            roomList = (LinkedList<Room>) objectInputStream.readObject();
            System.out.println("------------------HOUSE LIST------------------");
            for (Room room : roomList) {
                System.out.println(room.showInfor());
                System.out.println("");
            }
            System.out.println("----------------------------------------------");
        }catch (EOFException | NullPointerException e ){
            System.err.println("File Room.csv is empty, can not read file");
            displayService();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        finally {
            assert objectInputStream != null;
            objectInputStream.close();
        }
    }
}
