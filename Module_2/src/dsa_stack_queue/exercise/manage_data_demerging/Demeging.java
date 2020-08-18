package dsa_stack_queue.exercise.manage_data_demerging;

import java.util.*;

class Demeging {
    Queue<Object> menQueue = new LinkedList<>();
    Queue<Object> womenQueue = new LinkedList<>();
    List<Human> humanList = new ArrayList<>();

    public static class Human implements Comparable<Human> {
        private String name;
        private String gender;
        private String birthDay;

        public Human(String name, String gender, String birthDay) {
            this.name = name;
            this.gender = gender;
            this.birthDay = birthDay;
        }

        public String toString() {
            return "Name: " + this.name + "\n" +
                    "Gender: " + this.gender + "\n" +
                    "BirthDay: " + this.birthDay;
        }

        @Override
        public int compareTo(Human human) {
            return this.birthDay.compareTo(human.birthDay);
        }
    }

    public void addData(String name, String gender, String birthDay) {
        humanList.add(new Human(name, gender, birthDay));
        humanList.sort(Comparator.comparing(p -> p.birthDay));
    }

    public void manageDemeging() {
        for (Human human : humanList) {
            if (human.gender == "male") {
                menQueue.add(human);
            } else {
                womenQueue.add(human);
            }
        }
    }

    public void printQueue() {
        menQueue.stream().map(s -> s.toString()).forEach(System.out::println);
        System.out.println("");
        System.out.println("-------------");
        womenQueue.stream().map(s -> s.toString()).forEach(System.out::println);
    }
}
