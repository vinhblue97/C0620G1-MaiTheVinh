package fiding_algorithm.exercise.binary_search_by_excursion;

import java.util.Map;
import java.util.TreeMap;

class BynarySearch{
    Map<Integer, Student> studentList = new TreeMap<>();
    static int index = 0;

    private class Student{

        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Name: " + this.name + "\n" +
                    "Age: " + this.age;
        }
            }

    public void addStudent(String name, int age) {
        Student student = new Student(name, age);
        studentList.put(++index, student);
    }

    public void binarySearch(Student student) {

    }

}

