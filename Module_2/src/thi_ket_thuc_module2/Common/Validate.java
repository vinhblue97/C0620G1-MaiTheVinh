package thi_ket_thuc_module2.Common;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    Scanner scanner = new Scanner(System.in);

    public Validate() {
    }

    public String validateNumberPhone() {
        final String NUMBER_PHONE_REGEX = "\\d{10}";
        String numberPhone;
        do {
            System.out.println("Enter new number phone: ");
            numberPhone = scanner.nextLine();
            Pattern pattern = Pattern.compile(NUMBER_PHONE_REGEX);
            Matcher matcher = pattern.matcher(numberPhone);
            if (!matcher.matches()) {
                System.out.println("Number phone musts have 10 numbers, enter again please");
            } else {
                break;
            }
        } while (true);
        return numberPhone;
    }

    public String validateEmail(){
        final String EMAIL_REGEX ="^[\\w\\.]@[\\w\\.]+$";
        String email;
        do{
            System.out.println("Enter the email: ");
            email = scanner.nextLine();
            Pattern pattern = Pattern.compile(EMAIL_REGEX);
            Matcher matcher = pattern.matcher(email);
            if(!matcher.matches()){
                System.out.println("email must have format abc@abc.abc, enter again please");
            }else {
                break;
            }
        } while(true);
        return email;
    }
}
