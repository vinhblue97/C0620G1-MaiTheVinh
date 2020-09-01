package models;

import java.util.Scanner;
import java.util.Stack;

public class Cabinet {
    transient Scanner scanner = new Scanner(System.in);
    Stack<Employee> cabinet;

    public Cabinet(Stack<Employee> cabinet) {
        this.cabinet = cabinet;
    }

    public void find(){
        System.out.println("Find employee: ");
        String name = scanner.nextLine();
        for(Employee employee:cabinet){
            if (name.equals(employee.getName())){
                System.out.println(employee.toString());
            }
        }
    }
}
