package dsa_list.exercise.linked_list_by_java_util_linked_list;

class MyLinkedList {
    private Node head;
    private static int numNodes;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    public MyLinkedList() {

    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public void addLast(Object data) {
        Node temp = head;
        Node holder;
        while (temp.next != null) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("");
    }

    public void remove(int index) {
        Node temp = head;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        numNodes--;
    }

    public void remove(Object data) {
        Node temp = head;
        while (temp.next.getData() != data) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        numNodes--;
    }

    public int size() {
        return numNodes;
    }

    public MyLinkedList clone() {
        MyLinkedList newList = new MyLinkedList(head.getData());
        Node temp = head.next;
        while (temp != null) {
            newList.addLast(temp.getData());
            temp = temp.next;
        }
        return newList;
    }

    public boolean contain(Object data) {
        Node temp = head;
        while (temp != null) {
            if (temp.getData() == data) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(Object data) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.getData() == data) {
                return index;
            }
            index++;
            temp = temp.next;
        }
        return -1;
    }


    public Object get(int index) {
        Node temp = head;
        for (int i = 0; temp != null; i++) {
            if (i == index) {
                return temp.getData();
            }
            temp = temp.next;
        }
        return temp.getData();
    }

    public Object getFirst() {
        return head.getData();
    }

    public Object getLast() {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp.getData();
    }

    public void clear() {
        head = null;
        numNodes = 0;
    }

    public boolean add(Object data) {
        add(data);
        return true;
    }

}
