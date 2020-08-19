package fiding_algorithm.exercise.finding_max_array;

import java.util.LinkedList;

class Main {
    public static void main(String[] args) {
        // Create a Scanner
        String string = "njasndjkasdiuadqnwd";

        LinkedList<Character> max = new LinkedList<>();

        // Find the maximum increasingly ordered subsequence
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                System.out.print(string.charAt(j)+": ");
                System.out.println(string.charAt(j) > list.getLast());
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }

            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }

        // Display the maximum consecutive
        // increasingly ordered substring
//        for (Character ch: max) { // single loop
//            System.out.print(ch); // Simple statement
//        }
//        System.out.println();
    }
}
