package thi_ket_thuc_module2.task;

import thi_ket_thuc_module2.models.Telephone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DisplayNumberList {
    Scanner scanner = new Scanner(System.in);
    List<Telephone> telephoneNumberLists = new ArrayList<>();

    public DisplayNumberList(List<Telephone> telephoneNumberLists) {
        this.telephoneNumberLists = telephoneNumberLists;
    }

    public void displayList() {
        int count = 0;
        System.out.println("New Adding");
            for (Telephone element : telephoneNumberLists) {
                System.out.println(element.toString());
                System.out.println("****************");
                if (++count%6==0) {
                    scanner.nextLine();
                }
            }
        }
}
