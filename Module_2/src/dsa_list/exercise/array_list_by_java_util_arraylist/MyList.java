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

    public E remove(int index) {
        Object[] newElements = new Object[size() - 1];
        E element = (E) elements[index];
        for (int i = 0; i < size() - 1; i++) {
            if (i >= index) {
                newElements[i] = elements[i + 1];
            } else {
                newElements[i] = elements[i];
            }
        }
        elements = newElements;
        return element;
    }

    public int size() {
        return elements.length;
    }

    public boolean contain(E o) {
        int check = 0;
        for (Object element : elements) {
            if (element == o) {
                return true;
            } else check = 1;
        }
        return check != 1;
    }

    public int indexOf(E o) {
        int index = 0;
        for (; index < size(); index++) {
            boolean isEqualElement = elements[index] == o;
            if (isEqualElement) {
                return index;
            }
        }
        return -1;
    }

    public boolean add(E o) {
        elements = Arrays.copyOf(elements, size() + 1);
        elements[size()] = o;
        return true;
    }

    public E get(int index) {
        return (E) elements[index];
    }

    public void ensureCapacity(int minCapacity){
        int newSize = minCapacity;
        elements = Arrays.copyOf(elements,newSize);
    }

    public void clear(){
        elements = new Object[0];
    }

    public void getList() {
        for (Object element : elements) {
            System.out.print(element + " ");
        }
    }
}
