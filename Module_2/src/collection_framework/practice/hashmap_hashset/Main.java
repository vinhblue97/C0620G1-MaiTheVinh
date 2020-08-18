package collection_framework.practice.hashmap_hashset;

class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Vinh1", 10);
        Student student2 = new Student("Vinh2", 100);
        Student student3 = new Student("Vinh4", 90);
        Student student4 = new Student("Vinh0", 19);
        Student.hashMap(1, student1);
        Student.hashMap(2, student2);
        Student.hashMap(3, student3);
        Student.hashMap(4, student4);
        Student.printHashMap();

        Student.hashSet(student1);
        Student.hashSet(student2);
        Student.hashSet(student3);
        Student.hashSet(student4);
        Student.printHashSet();
    }
}
