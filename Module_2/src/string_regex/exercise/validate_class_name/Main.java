package string_regex.exercise.validate_class_name;

class Main {
    public static void main(String[] args) {
        ValidationName validationName= new ValidationName();
        System.out.println(validationName.validate("C0318G"));
        System.out.println(validationName.validate("M0318G"));
        System.out.println(validationName.validate("P0323A"));

    }
}
