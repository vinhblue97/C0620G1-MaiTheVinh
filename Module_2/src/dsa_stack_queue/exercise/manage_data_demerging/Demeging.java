package dsa_stack_queue.exercise.manage_data_demerging;

import java.util.LinkedList;
import java.util.Queue;

class Demeging<E> {
    Queue<E> menQueue = new LinkedList<>();
    Queue<E> womenQueue = new LinkedList<>();

    public void manageDemeging(E human, String gender) {

        if (gender == "man" || gender == "MAN") {
            menQueue.add(human);
        } else womenQueue.add(human);
    }

    public void printQueue() {
        for (E element : womenQueue) {
            System.out.print(element + " ");
        }
        System.out.println("----------------");
        for (E element : menQueue) {
            System.out.println(element + " ");
        }

    }
}
