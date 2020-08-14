package dsa_list.practice.simple_list;

import java.util.Arrays;

class MyList<E> {
    private int size = 0;
    private Object[] elements;

    public MyList() {
        int DEFAULT_CAPACITY = 10;
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public int ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
        return newSize;
    }

    public E get(int index) {
        boolean isGreaterThanLengthOfList = index > elements.length;
        boolean isLowerThanZero = index < 0;
        if (isGreaterThanLengthOfList || isLowerThanZero){
            throw new IndexOutOfBoundsException("Index:"+index+",Size: "+index);
        }
        return (E) elements[index];

    }
}
