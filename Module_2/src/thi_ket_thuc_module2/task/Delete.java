package thi_ket_thuc_module2.task;

import thi_ket_thuc_module2.models.Telephone;

import java.util.List;
import java.util.Scanner;

public class Delete {
    Scanner scanner = new Scanner(System.in);
    List<Telephone> telephoneList;

    public Delete(List<Telephone> telephoneList) {
        this.telephoneList = telephoneList;
    }

    public List<Telephone> delete() {
        System.out.println("Enter the phone you want to delete: ");
        String numberPhone = scanner.nextLine();
        loop:
        do {
            if (numberPhone.equals("")) {
                break loop;
            } else {
                for (Telephone phone : telephoneList) {
                    if (phone.getNumberPhone().equals(numberPhone)) {
                        System.out.println("Are you sure to delete this number(Y/N)");
                        String choise = scanner.nextLine();
                        if (choise.equals("Y")) {
                            telephoneList.remove(phone);
                            break loop;
                        } else {
                            break loop;
                        }
                    } else {
                        System.out.println("This number is not in list, please enter the number again");
                    }
                }
            }
        } while (true);
        return telephoneList;
    }
}
