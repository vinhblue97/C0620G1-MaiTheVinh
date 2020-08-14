package dsa_list.practice.simple_list;

class MyListTest {
    public static void main(String[] args){
        MyList<Integer> listInterger = new MyList<Integer>();
        listInterger.add(1);
        listInterger.add(2);
        listInterger.add(3);
        listInterger.add(4);
        System.out.println("Element 3: "+listInterger.get(2));
        System.out.print("Size: "+listInterger.ensureCapa());
        System.out.print("Size: "+listInterger.ensureCapa());
    }
}
