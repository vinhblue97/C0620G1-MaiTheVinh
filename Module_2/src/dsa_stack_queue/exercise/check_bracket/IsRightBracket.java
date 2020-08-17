package dsa_stack_queue.exercise.check_bracket;

import java.util.LinkedList;
import java.util.Queue;

class IsRightBracket {
    Queue<Character> queue = new LinkedList<>();

    public void checkBracket(String expression) {
        int index = 0;
        while (index < expression.length()) {
            queue.add(expression.charAt(index++));
        }
        int count1 = 0;
        int count2 = 0;
        for (char element : queue) {
            if (element == '(') {
                count1++;
            } else if (element == ')') {
                count2++;
            }
        }
        if (count1 == count2) {
            System.out.println("This expression: " + expression + " has right bracket");
        } else System.out.println("This expression: " + expression + " has wrong bracket");
    }
}
