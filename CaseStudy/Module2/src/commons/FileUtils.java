package commons;

import java.io.*;

public class FileUtils<E> {
    public E readFileCSV(String sourceFile) {
        E result = null;
        try (FileInputStream fileInputStream = new FileInputStream(sourceFile);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            result = (E) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            FileOutputStream newFile = new FileOutputStream(sourceFile);
        } catch (EOFException e) {
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        } finally {
            return result;
        }
    }

    public void writeFileCVS(String destFile, E object)  {
        try (FileOutputStream fileOutputStream = new FileOutputStream(destFile);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(object);
        } catch (NullPointerException | IOException e) {

        }
    }
}
