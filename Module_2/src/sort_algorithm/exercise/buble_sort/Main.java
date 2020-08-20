package sort_algorithm.exercise.buble_sort;

class Main {
    public static void main(String[] args) {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        BubleSort bubleSort = new BubleSort();
        bubleSort.bubbleSort(list);
        bubleSort.printList();
    }
}
