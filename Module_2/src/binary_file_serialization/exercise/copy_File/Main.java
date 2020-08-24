package binary_file_serialization.exercise.copy_File;

import java.io.File;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        File source = new File("E:\\C0620G1-MaiTheVinh\\Module_2\\src\\binary_file_serialization\\exercise\\copy_File\\source.txt");
        File dest = new File("E:\\C0620G1-MaiTheVinh\\Module_2\\src\\binary_file_serialization\\exercise\\copy_File\\dest.txt");
        CopyFile copy = new CopyFile();
        copy.copyFile(source, dest);
    }
}
