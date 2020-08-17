package dsa_stack_queue.exercise.queue_by_linked_circle;

class Client {
    public static void main(String[] args){
        Solution<Integer> test = new Solution<>();
        System.out.println("Declare a queue");
        test.enQueue(5);
        test.enQueue(6);
        test.enQueue(7);
        test.enQueue(8);
        test.enQueue(9);
        test.displayQueue();
        System.out.println("");
        System.out.println("Dequeue");
        test.deQueue();
        test.deQueue();
        test.displayQueue();
    }
}
