package string_regex.practice.validate_email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ValidationEmail {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    public  ValidationEmail(){
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validate(String email) {
        matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
