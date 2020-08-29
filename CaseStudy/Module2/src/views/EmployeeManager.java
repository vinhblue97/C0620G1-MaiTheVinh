package views;

import commons.FileUtils;
import models.Employee;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class EmployeeManager {
    static Map<String, Employee> employeeMap = new TreeMap<>();
    static Map<String, Employee> readMap = new TreeMap<>();


    public void setEmployeeMap() {
        Employee employee1 = new Employee("Nguyễn Văn A", 10, "DN");
        Employee employee2 = new Employee("Nguyễn Văn B", 11, "DN");
        Employee employee3 = new Employee("Nguyễn Văn C", 12, "DN");
        Employee employee4 = new Employee("Nguyễn Văn D", 13, "DN");
        Employee employee5 = new Employee("Nguyễn Văn E", 14, "DN");
        Employee employee6 = new Employee("Nguyễn Văn F", 15, "DN");
        Employee employee7 = new Employee("Nguyễn Văn G", 16, "DN");
        Employee employee8 = new Employee("Nguyễn Văn H", 17, "DN");
        Employee employee9 = new Employee("Nguyễn Văn J", 18, "DN");
        Employee employee10 = new Employee("Nguyễn Văn K", 19, "DN");
        employeeMap.put("001", employee1);
        employeeMap.put("002", employee2);
        employeeMap.put("003", employee3);
        employeeMap.put("004", employee4);
        employeeMap.put("005", employee5);
        employeeMap.put("006", employee6);
        employeeMap.put("007", employee7);
        employeeMap.put("008", employee8);
        employeeMap.put("009", employee9);
        employeeMap.put("010", employee10);
    }

    public void writeEmployeeFile() throws IOException {
        String employeePath = "E:\\C0620G1-MaiTheVinh\\CaseStudy\\Module2\\src\\data\\Employee.csv";
        FileOutputStream os = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            os = new FileOutputStream(employeePath);
            objectOutputStream = new ObjectOutputStream(os);
            objectOutputStream.writeObject(employeeMap);
            System.out.println("Write Employee.csv successfully");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            assert objectOutputStream != null;
            objectOutputStream.close();
            os.close();
        }
    }

    public static void readEmployeeFile() throws IOException {
        String employeePath = "E:\\C0620G1-MaiTheVinh\\CaseStudy\\Module2\\src\\data\\Employee.csv";
        FileUtils<Map<String, Employee>> fileUtils = new FileUtils<>();
            readMap = fileUtils.readFileCSV(employeePath);
            System.out.println("-------------------------EMPLOYEE LIST-------------------------");
            for(String id:readMap.keySet()){
                System.out.println("ID: "+id+"\n"+readMap.get(id).toString());
                System.out.println("");
            }
            System.out.println("---------------------------------------------------------------");
            System.out.println("Read Employee.csv successfully");
    }
}
