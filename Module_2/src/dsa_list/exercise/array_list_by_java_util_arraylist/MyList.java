package dsa_list.exercise.array_list_by_java_util_arraylist;

import java.util.Arrays;

public class MyList<E> {
    private Object[] elements;

    public MyList() {
        final int DEFAULT_CAPACITY = 10;
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        if (index >= elements.length) {
            elements = Arrays.copyOf(elements, index + 1);
        }
        elements[index] = element;
    }

    public void remove(int index) {
//        E element = (E) elements[index];
        int size = elements.length;
        Object[] elements1 = Arrays.copyOfRange(elements,0,elements.length-1);
        elements = Arrays.copyOfRange(elements1,0,index);
        getList();
        elements = Arrays.copyOfRange(elements1,index+1,size-1);
        getList();
//        return element;
    }

    public void getList() {
        for (Object element : elements) {
            System.out.print(element + " ");
        }
    }
}
