package dsa_stack_queue.exercise.check_bracket;

class Main {
    public static void main(String[] args) {
        String expression = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";
        IsRightBracket check = new IsRightBracket();
        check.checkBracket(expression);
    }
}
