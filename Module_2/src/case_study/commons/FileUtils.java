package case_study.commons;

import case_study.models.Vocabulary;

import java.io.*;
import java.util.Map;

public class FileUtils {

    public Map<String, Vocabulary> readFile(String sourceFile) {
        Map<String, Vocabulary> result = null;
        try (FileInputStream fileInputStream = new FileInputStream(sourceFile);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            result = (Map<String, Vocabulary>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            FileOutputStream newFile = new FileOutputStream(sourceFile);
        } catch (EOFException e) {
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        } finally {
            return result;
        }
    }

    public void writeFile(String destFile, Map<String, Vocabulary> object)  {
        try (FileOutputStream fileOutputStream = new FileOutputStream(destFile);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(object);
        } catch (NullPointerException | IOException e) {
        }
    }
}
