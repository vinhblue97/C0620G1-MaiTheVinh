package collection_framework.practice.hashmap_hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Student {
    private String name;
    private int age;
    static Map<Integer, Student> hashMap = new HashMap<>();
    static Set<Student> hashSet = new HashSet<>();

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public static void hashMap(int index, Student student){

        hashMap.put(index, student);
    }

    public static void hashSet(Student student){
        hashSet.add(student);
    }

    public static void printHashMap(){
        System.out.println("Hash Map");
        for(Map.Entry<Integer, Student> student : hashMap.entrySet()){
            System.out.println(student.toString());
        }
    }

    public static void printHashSet(){
        System.out.println("Hash Set");
        for(Student student : hashSet){
            System.out.println(student.toString());
        }
    }

    @Override
    public String toString() {
        return "Student: " + name + ", age=" + age;
    }

}
