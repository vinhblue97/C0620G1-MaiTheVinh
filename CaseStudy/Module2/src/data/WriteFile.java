package data;

import models.House;
import models.Room;
import models.Villa;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class WriteFile {
    private static final String COMMA_DELIMITER = ",";
    private final String FILE_VILLA_HEADER = "Id,Name,Area,Renting cost,Maximun People,Type of Renting (hours),Pool's Area,Amount of Floor";
    private final String FILE_HOUSE_HEADER = "Id,Name,Area,Renting cost,Maximun People,Type of Renting (hours),Amount of Floor";
    private final String FILE_ROOM_HEADER = "Id,Name,Area,Renting cost,Maximun People,Type of Renting (hours)";
    private final String VILLA_FILE = "E:\\C0620G1-MaiTheVinh\\CaseStudy\\Module2\\src\\data\\Villa.csv";
    private final String HOUSE_FILE = "E:\\C0620G1-MaiTheVinh\\CaseStudy\\Module2\\src\\data\\House.csv";
    private final String ROOM_FILE = "E:\\C0620G1-MaiTheVinh\\CaseStudy\\Module2\\src\\data\\Room.csv";
    private static final String NEW_LINE_SEPARATOR = "\n";

    public void writeVilla (LinkedList<Villa> villaList) throws IOException {
        FileWriter is = null;
        try {
            is = new FileWriter(VILLA_FILE);
            is.append(FILE_VILLA_HEADER );
            is.append(NEW_LINE_SEPARATOR);
            for (Villa e : villaList) {
                is.append(e.getVillaID()+"");
                is.append(COMMA_DELIMITER);
                is.append(e.serviceName);
                is.append(COMMA_DELIMITER);
                is.append(e.usesArea + "");
                is.append(COMMA_DELIMITER);
                is.append(e.rentCost + "");
                is.append(COMMA_DELIMITER);
                is.append(e.maxPeople + "");
                is.append(COMMA_DELIMITER);
                is.append((e.rentHour + e.rentDay * 24 + e.rentMonth * 24 * 30 + e.rentYear * 24 * 365)+"");
                is.append(COMMA_DELIMITER);
                is.append(e.getPoolArea() + "");
                is.append(COMMA_DELIMITER);
                is.append(e.getNumFloor() + "");
                is.append(NEW_LINE_SEPARATOR);
            }
            System.out.println("Write file Villa.csv successfully");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            assert is != null;
            is.close();
        }
    }

    public void writeHouse(LinkedList<House> houseList) throws IOException {
        FileWriter os = null;
        try {
            os = new FileWriter(HOUSE_FILE);
            os.append(FILE_HOUSE_HEADER);
            os.append(NEW_LINE_SEPARATOR);
            for (House e : houseList) {
                os.append(e.getHouseID()+"");
                os.append(COMMA_DELIMITER);
                os.append(e.serviceName);
                os.append(COMMA_DELIMITER);
                os.append(e.usesArea + "");
                os.append(COMMA_DELIMITER);
                os.append(e.rentCost + "");
                os.append(COMMA_DELIMITER);
                os.append(e.maxPeople + "");
                os.append(COMMA_DELIMITER);
                os.append((e.rentHour + e.rentDay * 24 + e.rentMonth * 24 * 30 + e.rentYear * 24 * 365)+"");
                os.append(COMMA_DELIMITER);
                os.append(e.getNumFloor() + "");
                os.append(NEW_LINE_SEPARATOR);
            }
            System.out.println("Write file House.csv successfully");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            assert os != null;
            os.close();
        }
    }

    public void writeRoom(LinkedList<Room> roomList) throws IOException {
        FileWriter os = null;
        try {
            os = new FileWriter(ROOM_FILE);
            os.append(FILE_ROOM_HEADER);
            os.append(NEW_LINE_SEPARATOR);
            for (Room e : roomList) {
                os.append(e.getRoomID()+"");
                os.append(COMMA_DELIMITER);
                os.append(e.serviceName);
                os.append(COMMA_DELIMITER);
                os.append(e.usesArea + "");
                os.append(COMMA_DELIMITER);
                os.append(e.rentCost + "");
                os.append(COMMA_DELIMITER);
                os.append(e.maxPeople + "");
                os.append(COMMA_DELIMITER);
                os.append((e.rentHour + e.rentDay * 24 + e.rentMonth * 24 * 30 + e.rentYear * 24 * 365)+"");
                os.append(NEW_LINE_SEPARATOR);
            }
            System.out.println("Write file House.csv successfully");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            assert os != null;
            os.close();
        }
    }
}
