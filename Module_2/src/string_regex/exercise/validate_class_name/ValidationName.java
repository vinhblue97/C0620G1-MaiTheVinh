package string_regex.exercise.validate_class_name;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ValidationName {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String CLASS_NAME = "^[A,C,P][0-9]{4}[G,H,I,K,L,M]$";

    public ValidationName(){
        pattern=Pattern.compile(CLASS_NAME);
    }

    public boolean validate(String name){
        matcher = pattern.matcher(name);
        return matcher.matches();
    }

}
