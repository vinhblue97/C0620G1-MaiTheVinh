package controllers;

import data.WriteService;
import models.House;
import models.Room;
import models.Villa;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class NewService {
    private boolean check = true;
    transient Scanner scanner = new Scanner(System.in);

    public boolean isCheck() {
        return check;
    }

    public void addNewService(List<Villa> villaList, List<House> houseList, List<Room> roomList) throws IOException {
        int choise = 0;
        addLoop:
        do {
            check = true;
            System.out.println("1. Add New Villa\n" +
                    "2. Add New House\n" +
                    "3. Add New Room\n" +
                    "4. Back to menu\n" +
                    "5. Exit\n");
            choise = scanner.nextInt();
            switch (choise) {
                case 1:
                    addVilla(villaList);
                    break;
                case 2:
                    addHouse(houseList);
                    break;
                case 3:
                    addRoom(roomList);
                    break;
                case 4:
                    break addLoop;
                case 5:
                    this.check = false;
                    break addLoop;
            }
        } while (true);
    }

    public void addVilla(List<Villa> villaList) throws IOException {
        int numVilla = villaList.size()+1;
        WriteService write = new WriteService();
        String villaId = setId(numVilla);
        System.out.println("Enter the Villa's Name");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Enter the Villa's Area");
        double area = setArea();
        System.out.println("Enter the Villa's cost");
        double rentCost = setRentCost();
        System.out.println("Enter the Villa's maximum people");
        int maxPeople = setMaxPeople();
        System.out.println("Enter the Villa's amount of floor");
        int numFloor = setFloor();
        Villa temp = new Villa(villaId, name, area, rentCost, maxPeople, numFloor, 0, 1, 0, 15.0, 3);
        villaList.add(temp);
        write.writeVilla(villaList);
    }

    public void addHouse(List<House> houseList) throws IOException {
        int numHouse = houseList.size()+1;
        WriteService write = new WriteService();
        String houseId = setId(numHouse);
        System.out.println("Enter the House's Name");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Enter the House's Area");
        double area = setArea();
        System.out.println("Enter the House's cost");
        double rentCost = setRentCost();
        System.out.println("Enter the House's maximum people");
        int maxPeople = setMaxPeople();
        House temp = new House(houseId, name, area, rentCost, maxPeople, 0, 0, 1, 0, 3);
        houseList.add(temp);
        write.writeHouse(houseList);
    }

    public void addRoom(List<Room> roomList) throws IOException {
        int numRoom = roomList.size()+1;
        WriteService write = new WriteService();
        String roomId = setId(numRoom);
        System.out.println("Enter the Room's Name");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Enter the Room's Area");
        double area = setArea();
        System.out.println("Enter the Room's cost");
        double rentCost = setRentCost();
        System.out.println("Enter the Room's maximum people");
        int maxPeople = setMaxPeople();
        Room temp = new Room(roomId, name, area, rentCost, maxPeople, 0, 0, 1, 0);
        roomList.add(temp);
        write.writeRoom(roomList);
    }

    public String setId(int num){
        if (num<10){
            return "000"+num;
        }else if(num<100){
            return "00"+num;
        }else if (num<1000){
            return "0"+num;
        } else return num+"";
    }

    public double setArea() {
        double area = 0.0;
        try {
            area = Double.parseDouble(scanner.nextLine());
            if (area % 1 != 0.0) {
                throw new InputMismatchException();
            }
            if (area <= 30.0) {
                throw new Exception();
            }
        } catch (InputMismatchException e) {
            System.err.println("Area must be a number, please enter again");
            return setArea();
        } catch (Exception e) {
            System.err.println("Area must be greater than 30.0, please enter again");
            return setArea();
        }
        return area;
    }

    public double setRentCost() {
        double cost;
        do {
            cost = Double.parseDouble(scanner.nextLine());
            if (cost <= 0.0) {
                System.out.println("Area must be a positive numbers");
            }
        } while (cost <= 0.0);
        return cost;
    }

    public int setMaxPeople() {
        int maxPeople;
        do {
            maxPeople = Integer.parseInt(scanner.nextLine());
            if (maxPeople <= 0 || maxPeople >= 20) {
                System.out.println("Area must be a positive numbers and lower than 20");
            }
        } while (maxPeople <= 0 || maxPeople >= 20);
        return maxPeople;
    }

    public int setFloor() {
        int numFloor;
        do {
            numFloor = Integer.parseInt(scanner.nextLine());
            if (numFloor <= 0) {
                System.out.println("Area must be a positive numbers");
            }
        } while (numFloor <= 0);
        return numFloor;
    }
}
