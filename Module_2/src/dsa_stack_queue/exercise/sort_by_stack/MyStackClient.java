package dsa_stack_queue.exercise.sort_by_stack;

class MyStackClient {
    public static void main(String[] args) {
        int[] arrays = new int[10];
        System.out.println("Pre-sort");
        for (int index = 0; index < arrays.length; index++) {
            arrays[index] = (int) Math.round(Math.random()*100);
            System.out.print(arrays[index] + " ");
        }
        System.out.println("");
        System.out.println("After-sort");
        MyStack<Integer> myStack = new MyStack<>();
        for (int index = 0; index < arrays.length; index++) {
            myStack.push(arrays[index]);
        }
        for (int index = 0; index < arrays.length; index++) {
            arrays[index] = myStack.get(index);
            System.out.print(arrays[index] + " ");
        }
    }

}
