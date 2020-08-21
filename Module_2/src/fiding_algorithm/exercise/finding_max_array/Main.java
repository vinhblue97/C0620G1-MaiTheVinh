package fiding_algorithm.exercise.finding_max_array;

import java.util.LinkedList;

class Main {
    public static void main(String[] args) {
        String string = "Welcome";
        LinkedList<Character> max = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (list.getLast() < string.charAt(j)) {
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max = (LinkedList<Character>) list.clone();
                list.clear();
            }
        }
        for (Character e : max) {
            System.out.print(e);
        }
    }
}

