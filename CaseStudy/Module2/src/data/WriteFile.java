package data;

import models.Villa;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class WriteFile {
    private static final String COMMA_DELIMITER = ",";
    private final String FILE_HEADER = "Id,Name,Area,Renting cost,Maximun People,Type of Renting (hours),Pool's Area,Amount of Floor";
    private final String VILLA_FILE = "E:\\C0620G1-MaiTheVinh\\CaseStudy\\Module2\\src\\data\\Villa.csv";
    private static final String NEW_LINE_SEPARATOR = "\n";

    public void writeVilla (LinkedList villaList) throws IOException {
        FileWriter os = null;
        try {
            os = new FileWriter(VILLA_FILE);
            os.append(FILE_HEADER);
            os.append(NEW_LINE_SEPARATOR);
            for (Villa e : villaList) {
                os.append(e.getId()+"");
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
                os.append(e.getPoolArea() + "");
                os.append(COMMA_DELIMITER);
                os.append(e.getNumFloor() + "");
                os.append(NEW_LINE_SEPARATOR);
            }
            System.out.println("Write file Villa.csv successfully");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            assert os != null;
            os.close();
        }
    }
}
