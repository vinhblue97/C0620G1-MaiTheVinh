package dsa_stack_queue.exercise.queue_by_linked_circle;

class Solution<E> {
    Queue queue = new Queue();

    public void enQueue(E data) {
        Node temp = new Node(data);
        if (queue.front == null) {
            queue.front = queue.rear = temp;
            return;
        }
        queue.rear.next = temp;
        queue.rear = temp;
    }

    public E deQueue() {
        if (queue.front == null) {
            return null;
        }
        Node temp = queue.front;
        queue.front = queue.front.next;
        return (E) temp.getData();
    }

    public void displayQueue() {
        Node temp = queue.front;
        while (temp != null) {
            System.out.print(temp.getData()+" ");
            temp = temp.next;
        }
    }
}
