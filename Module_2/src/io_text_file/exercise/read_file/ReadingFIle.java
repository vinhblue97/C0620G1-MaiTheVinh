package io_text_file.exercise.read_file;

import java.io.*;

class ReadingFile {
    public void readFile(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] array = line.split("");
                int count = 0;
                for (int index = 0; index<array.length-3;index++) {
                    if (array[index].equals(",")){
                        count++;
                    }
                    if (count==5){
                        System.out.print(array[index+2]);
                    }

                }
                System.out.println("");
            }
        } catch (FileNotFoundException e) {
            System.err.println("File doesn't exist or has error");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
