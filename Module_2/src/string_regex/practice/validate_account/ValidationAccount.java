package string_regex.practice.validate_account;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ValidationAccount {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String ACOUNT_REGEX = "^[_a-z0-9]{6,}$";

    public ValidationAccount(){
        pattern=Pattern.compile(ACOUNT_REGEX);
    }

    public boolean validate(String account){
        matcher=pattern.matcher(account);
        return matcher.matches();
    }
}
