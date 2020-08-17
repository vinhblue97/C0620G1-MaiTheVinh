package dsa_stack_queue.exercise.queue_by_linked_circle;

class Node<E> {
    private E data;
    public Node next;

    public E getData() {
        return data;
    }

    public Node(E data) {
        this.data = data;
        this.next = null;
    }
}
