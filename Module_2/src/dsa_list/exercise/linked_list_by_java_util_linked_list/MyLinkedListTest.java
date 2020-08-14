package dsa_list.exercise.linked_list_by_java_util_linked_list;

class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        MyLinkedList myLinkedList1 = new MyLinkedList();
        Test test = new Test(15);
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(12);
        myLinkedList.add(2, 4);
        myLinkedList.addLast(test);
        myLinkedList.addLast(12);
        myLinkedList.printList();
        System.out.println(myLinkedList.size());
        myLinkedList.printList();
        myLinkedList.remove(test);
        myLinkedList.printList();
        myLinkedList.addFirst(5);
        myLinkedList.printList();
        System.out.println("New Node");
        myLinkedList1 = myLinkedList.clone();
        myLinkedList1.printList();

    }
}
