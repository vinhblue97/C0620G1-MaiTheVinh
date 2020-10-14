package common;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {

    // Validate Name
    public static String validateName(String name) {
        String msg = "Not OK";
        if (!name.equals("")) {
            msg = "OK";
        }
        return msg;
    }

    // Validate price

    public static String validatePrice(String price) {
        String msg = "Not OK";
        if (!price.equals("") && Double.parseDouble(price) > 10000000) {
            msg = "OK";
        }
        return msg;
    }

    // Validate Quantity

    public static String validateQuantity(String quantity) {
        String msg = "Not OK";
        if (!quantity.equals("") && Integer.parseInt(quantity) > 0) {
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

    public static String validatePositiveNumber(String num) {
        String message = "OK";
//        System.out.println(WordUtils.capitalizeFully("mai thế vInh"));
        if (!NumberUtils.isParsable(num)) {
            return "Not OK. Input must be a number";
        }
        double number = Double.parseDouble(num);
        if (number <= 0) {
            return "Not OK. Number must be positive";
        }
        return message;
    }
}


