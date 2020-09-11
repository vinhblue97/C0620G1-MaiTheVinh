package file_util;

import java.io.*;

public class FileUtil<E> {
    public E readFile(String path) {
        E result = null;
        try (FileReader fileReader = new FileReader(path)) {
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] string = line.split(",");
                for (String temp : string) {
                    System.out.println(temp);
                }
            }
        } catch (FileNotFoundException e) {
            FileWriter fileWriter = new FileWriter(path);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            return result;
        }
    }
}
