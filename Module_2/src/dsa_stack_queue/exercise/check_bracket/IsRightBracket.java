package dsa_stack_queue.exercise.check_bracket;

import java.util.LinkedList;
import java.util.Queue;

class IsRightBracket {
    Queue<Character> queue = new LinkedList<>();

    public void checkBracket(String expression) {
        addQueue(expression);
        if (checkNumOfBracket()) {

        } else System.out.println(expression + " has wrong bracket");
    }

    public void addQueue(String expression) {
        int index = 0;
        while (index < expression.length()) {
            queue.add(expression.charAt(index++));
        }
    }

    public boolean checkNumOfBracket() {
        int count1 = 0;
        int count2 = 0;
        for (char element : queue) {
            if (element == '(') {
                count1++;
            } else if (element == ')') {
                count2++;
            }
        }
        return count1 == count2;
    }

    public boolean checkRightBracket(){
        return true;
    }
}
