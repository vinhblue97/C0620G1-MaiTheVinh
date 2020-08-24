package string_regex.exercise.validate_numberphone;

class Main {
    public static void main(String[] args) {
        ValidationNum validationNum = new ValidationNum();
        System.out.println(validationNum.validate("(84)-(0978489648)"));
        System.out.println(validationNum.validate("(a8)-(22222222))"));
    }
}
