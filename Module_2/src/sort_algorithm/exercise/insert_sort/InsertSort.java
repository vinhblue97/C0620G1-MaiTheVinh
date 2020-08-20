package sort_algorithm.exercise.insert_sort;

class InsertSort {
    final int MIN = -9999999;
    private int[] list;

    public InsertSort() {

    }

    public void setList(int[] list) {
        this.list = new int[list.length + 1];
        this.list[0] = MIN;
        int index = 1;
        for (int element : list) {
            this.list[index] = element;
            index++;
        }
    }

    public void insertSort(int[] list) {
        setList(list);
        for (int firstIndex = 2; firstIndex < this.list.length; firstIndex++) {
            int temp = this.list[firstIndex];
            int secondIndex = firstIndex - 1;
            while (temp < this.list[secondIndex]) {
                this.list[secondIndex + 1] = this.list[secondIndex];
                secondIndex -= 1;
            }
            this.list[secondIndex + 1] = temp;
        }
        for (int index = 0; index < this.list.length-1; index++) {
            list[index] = this.list[index + 1];
        }
    }

    public void printList(int[] list) {
        for (int element : list) {
            System.out.print(element + " ");
        }
    }
}
