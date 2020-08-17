package dsa_stack_queue.practice.stack_by_linked_list;

import java.util.EmptyStackException;
import java.util.LinkedList;


class MyGenericStack<T> {
    //Tạo lớp MyGenericStack với các thuộc tính:
    private LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList();
    }

    //    Cài đặt phương thức push()
    public void push(T element) {
        stack.addFirst(element);
    }

    //    Cài đặt phương thức pop()
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    //     Cài đặt phương thức size()
    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
}
