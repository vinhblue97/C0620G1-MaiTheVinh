package dsa_stack_queue.exercise.convert_decimal_to_binary;

import java.util.Stack;

class ConvertToBinary {
    private int[] arr;
    Stack<Integer> stack = new Stack<>();

    public void convertBinary(int number) {
        int remainder;
        do {
            remainder = number % 2;
            stack.push(remainder);
            number = number / 2;
        } while (number / 2 != 0);
        stack.push(number);
    }

    public void printStack() {
        arr = new int[stack.size()];
        for (int index = 0; index < stack.size(); index++) {
            arr[index] = stack.get(stack.size() - index - 1);
        }
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println("");
    }


}
