package sort_algorithm.exercise.buble_sort;

class BubleSort {
    private int[] list;

    public void setList(int[] list) {
        this.list = list;
    }

    public void bubbleSort(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            /* Array may be sorted and next pass not needed */
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    /* Swap list[i] with list[i + 1] */
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true; /* Next pass still needed */
                }
            }
        }
        setList(list);
    }
    public void printList(){
        for(int element:list){
            System.out.print(element+" ");
        }
    }
}
