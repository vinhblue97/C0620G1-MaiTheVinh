package string_regex.practice.validate_account;

class Main {
    public static void main(String[] args) {
        ValidationAccount validationAccount = new ValidationAccount();
        System.out.println(validationAccount.validate("123abc_"));
        System.out.println(validationAccount.validate("12345"));
    }
}
