package dsa_stack_queue.exercise.check_palindrome_by_queue;

import java.util.LinkedList;
import java.util.Queue;

class IsPalindrome {

    public void isPalindrome(int number) {
        if (isPrime(number)) {
            if (number < 10) {
                System.out.println(number + " is one of the palindrome set");
            } else {
                if (isSymetry(number)) {
                    System.out.println(number + " is one of the palindrome set");
                } else {
                    System.out.println(number + " is not one of the palindrome set");
                }
            }
        } else {
            System.out.println(number + " is not one of the palindrome set");
        }

    }

    public boolean isPrime(int number) {
        int i = 1;
        int count = 0;
        while (i <= Math.sqrt(number)) {
            if (number % i == 0) {
                count++;
            }
            i++;
        }
        return (count == 1);
    }

    public boolean isSymetry(int number) {
        int count = 0;
        Queue<Integer> queue = new LinkedList<>();
        while (number > 9) {
            queue.add(number % 10);
            number = (number - queue.peek()) / 10;
        }
        queue.add(number);
        int[] temp = new int[queue.size()];
        int index = -1;
        for (int e : queue) {
            temp[++index] = e;
        }
        for (index = 0; index < temp.length / 2; index++) {
            if (temp[index] == temp[temp.length - 1 - index]) {
                count++;
            }
        }
        return (count == temp.length / 2);

    }
}

