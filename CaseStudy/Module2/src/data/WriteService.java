package data;

import models.House;
import models.Room;
import models.Villa;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class WriteService {
    private final String VILLA_FILE = "E:\\C0620G1-MaiTheVinh\\CaseStudy\\Module2\\src\\data\\Villa.csv";
    private final String HOUSE_FILE = "E:\\C0620G1-MaiTheVinh\\CaseStudy\\Module2\\src\\data\\House.csv";
    private final String ROOM_FILE = "E:\\C0620G1-MaiTheVinh\\CaseStudy\\Module2\\src\\data\\Room.csv";

    public void writeVilla(List<Villa> villaList) throws IOException {
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

    public void writeHouse(List<House> houseList) throws IOException {
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

    public void writeRoom(List<Room> roomList) throws IOException {
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
