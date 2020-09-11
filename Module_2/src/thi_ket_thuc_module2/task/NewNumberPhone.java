package thi_ket_thuc_module2.task;

import thi_ket_thuc_module2.Common.Validate;
import thi_ket_thuc_module2.models.Telephone;

import java.util.List;
import java.util.Scanner;

public class NewNumberPhone {
    Scanner scanner = new Scanner(System.in);
    List<Telephone> telephoneNumberLists;

    public NewNumberPhone(List<Telephone> telephoneNumberLists) {
        this.telephoneNumberLists = telephoneNumberLists;
    }

    public List<Telephone> addNewPhone() {

        Validate validate = new Validate();
        String numberPhone = validate.validateNumberPhone();
        System.out.println("Enter the type of telephone number ");
        String type = scanner.nextLine();
        System.out.println("Enter the user's name: ");
        String userName = scanner.nextLine();
        System.out.println("Enter the gender: ");
        String gender = scanner.nextLine();
        System.out.println("Enter the address: ");
        String address = scanner.nextLine();
        System.out.println("Enter the birth day: ");
        String birthDay = scanner.nextLine();
        String email = validate.validateEmail();
        Telephone newPhone = new Telephone(numberPhone, type, userName, gender, address, birthDay, email);
        telephoneNumberLists.add(newPhone);
        return telephoneNumberLists;
    }

}
