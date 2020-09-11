package thi_ket_thuc_module2.task;

import thi_ket_thuc_module2.Common.Validate;
import thi_ket_thuc_module2.models.Telephone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UpdateInfor {
    Scanner scanner = new Scanner(System.in);
    List<Telephone> telephoneNumberLists = new ArrayList<>();

    public UpdateInfor(List<Telephone> telephoneNumberLists) {
        this.telephoneNumberLists = telephoneNumberLists;
    }

    public void updateInfor() {
        int id = 0;
        System.out.println("Enter the number phone you want to update: ");
        String numberPhone = scanner.nextLine();
        if (numberPhone.equals("")) {
            return;
        } else {
            boolean check = false;
            for (Telephone phone : telephoneNumberLists) {
                if (phone.getNumberPhone().equals(numberPhone)) {
                    System.out.println("New number phone");
                    Validate validate = new Validate();
                    String number = validate.validateNumberPhone();
                    phone.setNumberPhone(number);
                    System.out.println("Success");
                    check = true;
                    id = phone.getId();
                    break;
                }
            }
            if (!check) {
                System.out.println("Can not find the number phone you want update");
            }
        }
        System.out.println("Do you want update more information? (Y/N)");
        String choise = scanner.nextLine();
        if (choise.equals("Y")) {
            updateMore(id);
        }
    }

    public void updateMore(int id) {
        do {
            System.out.println("1.Nhóm danh bạ\n" +
                    "2.Họ tên\n" +
                    "3.Giới tính \n" +
                    "4.Địa chỉ\n" +
                    "5. Ngày sinh\n" +
                    "6. Email\n" +
                    "7. Exit");
            String updateMore = scanner.nextLine();
            switch (updateMore) {
                case "1":
                    System.out.println("Enter new type");
                    String type = scanner.nextLine();
                    if (!type.equals("")) {
                        telephoneNumberLists.get(id-1).setUserName(type);
                    }
                    break;
                case "2":
                    System.out.println("Enter new name");
                    String name = scanner.nextLine();
                    if (!name.equals("")) {
                        telephoneNumberLists.get(id-1).setUserName(name);
                    }
                    break;
                case "3":
                    System.out.println("Enter new gender");
                    String gender = scanner.nextLine();
                    if (!gender.equals("")) {
                        telephoneNumberLists.get(id-1).setUserName(gender);
                    }
                    break;
                case "4":
                    System.out.println("Enter new address");
                    String address = scanner.nextLine();
                    if (!address.equals("")) {
                        telephoneNumberLists.get(id-1).setUserName(address);
                    }
                    break;
                case "5":
                    System.out.println("Enter new birth day");
                    String birthDay = scanner.nextLine();   
                    if (!birthDay.equals("")) {
                        telephoneNumberLists.get(id-1).setUserName(birthDay);
                    }
                    break;
                case "6":
                    Validate validate = new Validate();
                    String email = validate.validateEmail();
                    telephoneNumberLists.get(id-1).setUserName(email);
                    break;
                case "7":
                    return;
            }
        } while (true);
    }
}
