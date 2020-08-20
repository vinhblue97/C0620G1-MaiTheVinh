package sort_algorithm.exercise.insert_sort;

class Main {
    public static void main(String[] args){
        int[] list = {8,4,2,6,1,7,5,3,-1,-6,10};
        InsertSort test = new InsertSort();
        test.insertSort(list);
        test.printList(list);
    }
}
