
package bai_tap_them.tidy_game;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Queue<Integer> tidy = new LinkedList<>();
        tidy.add(1);
        tidy.add(2);
        tidy.add(3);
        tidy.add(4);
        tidy.add(5);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        long n = scanner.nextLong();
        for(long index = 1; index <n; index++){
            int temp = tidy.poll();
            tidy.add(temp);
            tidy.add(temp);
        }
        System.out.println(tidy.peek());
    }
}
