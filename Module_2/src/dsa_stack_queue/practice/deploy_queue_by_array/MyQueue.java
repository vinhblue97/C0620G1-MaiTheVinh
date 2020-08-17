package dsa_stack_queue.practice.deploy_queue_by_array;

class MyQueue {
    private int capacity;
    private int[] queueArr;
    private int head;
    private int tail;
    private int currentSize;

    public MyQueue(int queueSize) {
        this.head = 0;
        this.tail = -1;
        this.currentSize = 0;
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueFull() {
        boolean isEqualCapa = currentSize == capacity;
        return isEqualCapa;
    }

    public boolean isQueueEmpty() {
        boolean isEqualZero = currentSize == 0;
        return isEqualZero;
    }

    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Overflow ! Unable to add element: " + item);
        } else {
            tail++;
            if (tail == capacity - 1) {
                tail = 0;
            }
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Element " + item + " is pushed to Queue !");
        }
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Underflow ! Unable to remove element from Queue");
        } else {
            head++;
            if (head == capacity - 1) {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
                head = 0;
            } else {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
            }
            currentSize--;
        }
    }

}
