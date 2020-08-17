package dsa_stack_queue.exercise.sort_by_stack;

import java.util.LinkedList;

class MyStack<E> {
    private LinkedList<E> stack;


    public MyStack() {
        stack = new LinkedList<E>();
    }

    public void push(E element) {
        stack.addFirst(element);

    }

    public E get(int index) {
        return stack.get(index);
    }

}
