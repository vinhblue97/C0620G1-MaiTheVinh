package controllers;

import data.WriteFile;
import models.House;
import models.Room;
import models.Villa;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewService {
    private boolean check = true;
    Scanner scanner = new Scanner(System.in);


    public boolean isCheck() {
        return check;
    }

    public void addNewService(LinkedList<Villa> villaList, LinkedList<House> houseList, LinkedList<Room> roomList) throws IOException {
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

    public void addVilla(LinkedList<Villa> villaList) throws IOException {
        WriteFile write = new WriteFile();
        System.out.println("Enter the Villa's Name");
        String name = setName();
        System.out.println("Enter the Villa's Area");
        double area = setArea();
        System.out.println("Enter the Villa's cost");
        double rentCost = setRentCost();
        System.out.println("Enter the Villa's maximum people");
        int maxPeople = setMaxPeople();
        System.out.println("Enter the Villa's amount of floor");
        int numFloor = setFloor();
        Villa temp = new Villa("",name, area, rentCost, maxPeople, numFloor, 0, 1, 0, 15.0, 3);
        villaList.add(temp);
        write.writeVilla(villaList);
    }

    public void addHouse(LinkedList<House> houseList) throws IOException {
        WriteFile write = new WriteFile();
        System.out.println("Enter the House's Name");
        String name = setName();
        System.out.println("Enter the House's Area");
        double area = setArea();
        System.out.println("Enter the House's cost");
        double rentCost = setRentCost();
        System.out.println("Enter the House's maximum people");
        int maxPeople = setMaxPeople();
        House temp = new House("",name, area, rentCost, maxPeople, 0, 0, 1, 0, 3);
        houseList.add(temp);
        write.writeHouse(houseList);
    }

    public void addRoom(LinkedList<Room> roomList) throws IOException {
        WriteFile write = new WriteFile();
        System.out.println("Enter the Room's Name");
        String name = setName();
        System.out.println("Enter the Room's Area");
        double area = setArea();
        System.out.println("Enter the Room's cost");
        double rentCost = setRentCost();
        System.out.println("Enter the Room's maximum people");
        int maxPeople = setMaxPeople();
        Room temp = new Room("",name, area, rentCost, maxPeople, 0, 0, 1, 0);
        roomList.add(temp);
        write.writeRoom(roomList);
    }

    public String setName() {
        String name = "";
        do {
            name = scanner.next();
            if (validateName(name)) {
                System.out.println("Name is not correct with form");
            }
        } while (!validateName(name));
        return name;
    }

    public boolean validateName(String name) {
        Pattern pattern;
        Matcher matcher;
        String villaName = "^[A-Z][a-z]+$";
        pattern = Pattern.compile(villaName);
        matcher = pattern.matcher(name);
        return matcher.matches();
    }

    public double setArea() {
        double area;
        do {
            area = scanner.nextDouble();
            if (area < 30.0) {
                System.out.println("Area must be greater than 30.0");
            }
        } while (area < 30.0);
        return area;
    }

    public double setRentCost() {
        double cost;
        do {
            cost = scanner.nextDouble();
            if (cost <= 0.0) {
                System.out.println("Area must be a positive numbers");
            }
        } while (cost <= 0.0);
        return cost;
    }

    public int setMaxPeople(){
        int maxPeople;
        do {
            maxPeople = scanner.nextInt();
            if (maxPeople <= 0.0||maxPeople>=20) {
                System.out.println("Area must be a positive numbers and lower than 20");
            }
        } while (maxPeople <= 0||maxPeople>=20);
        return maxPeople;
    }

    public int setFloor(){
        int numFloor;
        do {
            numFloor = scanner.nextInt();
            if (numFloor <= 0) {
                System.out.println("Area must be a positive numbers");
            }
        } while (numFloor <= 0);
        return numFloor;
    }
}
