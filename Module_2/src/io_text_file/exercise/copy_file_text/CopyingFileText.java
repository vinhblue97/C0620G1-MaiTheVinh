package io_text_file.exercise.copy_file_text;

import java.io.*;

class CopyingFileText {
    public void readFile(String filePath){
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            FileOutputStream targetFile = new FileOutputStream("E:\\C0620G1-MaiTheVinh\\Module_2\\src\\io_text_file\\exercise\\copy_file_text\\targetFile.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                byte[] a = line.getBytes();
                targetFile.write(a);
                targetFile.write('\r');
                targetFile.write('\n');
            }
            br.close();
            targetFile.close();
        } catch (FileNotFoundException e) {
            System.err.println("File does not exist or has error");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
