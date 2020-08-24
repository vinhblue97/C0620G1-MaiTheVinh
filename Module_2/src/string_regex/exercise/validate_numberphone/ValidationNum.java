package string_regex.exercise.validate_numberphone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ValidationNum {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String NUMBERPHONE_REGEX = "^\\([0-9]{2}\\)\\-\\([0][0-9]{9}\\)$";

    public ValidationNum(){
        pattern = Pattern.compile(NUMBERPHONE_REGEX);
    }

    public boolean validate(String number){
        matcher = pattern.matcher(number);
        return matcher.matches();
    }
}
