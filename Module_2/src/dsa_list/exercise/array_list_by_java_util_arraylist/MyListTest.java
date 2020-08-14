package dsa_list.exercise.array_list_by_java_util_arraylist;

class MyListTest {
    public static void main(String[] args){
        MyList<Integer> myList = new MyList<Integer>();
        for (int index = 0; index < 20; index++){
            myList.add(index,index+10);
        }
        myList.getList();
    }
}
