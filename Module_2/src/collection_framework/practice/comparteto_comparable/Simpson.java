package collection_framework.practice.comparteto_comparable;

class Simpson implements Comparable<Simpson>{
    String name;
    int age;
    Simpson(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public int compareTo(Simpson simpson) {
        return this.name.compareTo(simpson.name);
    }

}
