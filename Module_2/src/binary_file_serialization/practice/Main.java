package binary_file_serialization.practice;

import java.io.File;
import java.io.IOException;

class Main {
    public static void main(String[] args){
        File source = new File("E:\\C0620G1-MaiTheVinh\\Module_2\\src\\binary_file_serialization\\practice\\source.rar");
        File dest = new File("E:\\C0620G1-MaiTheVinh\\Module_2\\src\\binary_file_serialization\\practice\\dest.rar");
        try{
            CopyFile copyFile = new CopyFile();
//            copyFile.copyFileUsingJava7Files(source, dest);
            copyFile.copyFileUsingStream(source,dest);
            System.out.printf("Copy completed");
        }catch (IOException ioe) {
            System.out.printf("Can't copy that file");
            System.out.printf(ioe.getMessage());
        }
    }
}
