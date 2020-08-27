package data;

import models.House;
import models.Room;
import models.Villa;

import java.io.*;
import java.util.LinkedList;

public class WriteService {
    private final String VILLA_FILE = "E:\\C0620G1-MaiTheVinh\\CaseStudy\\Module2\\src\\data\\Villa.csv";
    private final String HOUSE_FILE = "E:\\C0620G1-MaiTheVinh\\CaseStudy\\Module2\\src\\data\\House.csv";
    private final String ROOM_FILE = "E:\\C0620G1-MaiTheVinh\\CaseStudy\\Module2\\src\\data\\Room.csv";

    public void writeVilla(LinkedList<Villa> villaList) throws IOException {
        FileOutputStream output = new FileOutputStream(VILLA_FILE);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(output);
        try {
            objectOutputStream.writeObject(villaList);
            System.out.println("Write file Villa.csv successfully");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            objectOutputStream.close();
        }
    }

    public void writeHouse(LinkedList<House> houseList) throws IOException {
        FileOutputStream output = new FileOutputStream(HOUSE_FILE);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(output);
        try {
            objectOutputStream.writeObject(houseList);
            System.out.println("Write file House.csv successfully");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            objectOutputStream.close();
        }
    }

    public void writeRoom(LinkedList<Room> roomList) throws IOException {
        FileOutputStream output = new FileOutputStream(ROOM_FILE);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(output);
        try {
            objectOutputStream.writeObject(roomList);
            System.out.println("Write file Room.csv successfully");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            objectOutputStream.close();
        }
    }
}
