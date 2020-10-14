package common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {

    // Validate customer ID
    public static String validateCustomerID(String ID) {
        String msg = "Not OK";
        Pattern pattern = Pattern.compile("^KH\\-\\d{4}$");
        Matcher matcher = pattern.matcher(ID);
        if (matcher.matches()) {
            msg = "OK";
        }
        return msg;
    }

    // Validate Customer phone

    public static String validateCustomerPhone(String phone) {
        String msg = "Not OK";
        Pattern pattern = Pattern.compile("^(090|091|\\(84\\)\\+90|\\(84\\)+01)\\d{7}$");
        Matcher matcher = pattern.matcher(phone);
        if (matcher.matches()) {
            msg = "OK";
        }
        return msg;
    }

    // Validate Customer Identify card

    public static String validateIdCard(String identify_card) {
        String msg = "Not OK";
        Pattern pattern = Pattern.compile("^(\\d{9}|\\d{12})$");
        Matcher matcher = pattern.matcher(identify_card);
        if (matcher.matches()) {
            msg = "OK";
        }
        return msg;
    }

    // Validate Customer Email

    public static String validateEmail(String email) {
        String msg = "Not OK";
        Pattern pattern = Pattern.compile("^[A-z]\\w+@[a-z]+(\\.[a-z]+){1,3}$");
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            msg = "OK";
        }
        return msg;
    }

    //Validate Service ID
    public static String valiedateSericeID(String ID) {
        String msg = "Not OK";
        Pattern pattern = Pattern.compile("^DV\\-\\d{4}$");
        Matcher matcher = pattern.matcher(ID);
        if (matcher.matches()) {
            msg = "OK";
        }
        return msg;
    }

    // Validate


}
